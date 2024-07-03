package com.shakeel.demo.repoisatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shakeel.demo.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Integer> {

}
