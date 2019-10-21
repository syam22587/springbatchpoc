package com.newkuar.springbatchpoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newkuar.springbatchpoc.entity.Users;

public interface AccountRepository  extends JpaRepository<Users, Long>{

}
