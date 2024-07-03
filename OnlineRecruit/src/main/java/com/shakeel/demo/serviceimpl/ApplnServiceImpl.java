package com.shakeel.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakeel.demo.model.Application;
import com.shakeel.demo.model.Job;
import com.shakeel.demo.repoisatory.AppRepo;
import com.shakeel.demo.service.ApplnService;

import jakarta.persistence.EntityManager;

@Service
public class ApplnServiceImpl implements ApplnService {

	@Autowired
	AppRepo emprepo;

	@Autowired
	EntityManager eman;

	public Application getApplication(int id) {
		Optional<Application> appln = emprepo.findById(id);
		return appln.orElse(null);
		}

	public List<Application> getAllApplication() {
		return emprepo.findAll();
	}

	public void deleteApplication(int id) {
		emprepo.deleteById(id);

	}

	@Override
	public String addEmp(Application emp, int pId) {
		Job py = eman.find(Job.class, pId);
		if (py != null) {
			emp.setJob(py);
			emprepo.save(emp);
			return "added user";

		} else {
			return "not added";
		}

	}

	public String updateApplication(Application emp, int eid) {
		Application em = eman.find(Application.class, eid);

		if (em != null) {
			em.setUsername(emp.getUsername());
			em.setCity(emp.getCity());
			em.setQualification(emp.getQualification());
			em.setEmail(emp.getEmail());
			em.setExperience(emp.getExperience());
			emprepo.save(em);
			return "updated user";
		} else {
			return "not updated";
		}

	}

}
