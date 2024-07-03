package com.shakeel.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.shakeel.demo.model.Application;

@Service
public interface ApplnService {

	String addEmp(Application emp, int pId);

	public Application getApplication(int id);

	public List<Application> getAllApplication();

	public void deleteApplication(int id);

	public String updateApplication(Application emp, int eid);
}
