package com.shakeel.demo.repoisatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shakeel.demo.model.Application;

@Repository
public interface AppRepo extends JpaRepository<Application, Integer> {

}
