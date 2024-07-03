package com.shakeel.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakeel.demo.model.Job;
import com.shakeel.demo.repoisatory.JobRepo;

@Service
public class JobServiceImpl {

	@Autowired
	JobRepo jarepo;

	public void addPay(Job pay) {
		jarepo.save(pay);
	}

	public Job getJob(int id) {
		Optional<Job> jobb = jarepo.findById(id);
		return jobb.orElse(null);
		}

	public List<Job> getAllPayroll() {
		return jarepo.findAll();
	}

	public void updatePayroll(Job pay) {
		jarepo.save(pay);

	}

	public void deletePayroll(int id) {
		jarepo.deleteById(id);

	}

}
