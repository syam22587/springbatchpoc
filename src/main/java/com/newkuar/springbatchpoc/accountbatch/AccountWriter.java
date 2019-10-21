package com.newkuar.springbatchpoc.accountbatch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.newkuar.springbatchpoc.entity.Users;
import com.newkuar.springbatchpoc.repository.AccountRepository;

@Component	
public class AccountWriter implements ItemWriter<Users> {
	
	@Autowired
	private AccountRepository repo;

	@Override
	@Transactional
	public void write(List<? extends Users> users) throws Exception {
		// TODO Auto-generated method stub
		
		repo.saveAll(users);
		
	}

	 

}
