package com.shakeel.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.shakeel.demo.model.Job;

@Service
public interface JobService {

	public void addPay(Job pay);

	public Job getJob(int id);

	public List<Job> getAllPayroll();

	public void updatePayroll(Job pay);

	public void deletePayroll(int id);
}
