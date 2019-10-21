package com.newkuar.springbatchpoc.accountbatch;

import java.util.Optional;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.newkuar.springbatchpoc.entity.Users;
import com.newkuar.springbatchpoc.repository.AccountRepository;


@Component
public class AccountProcessor implements ItemProcessor<Users, Users> {

	
	@Autowired
	AccountRepository accountRepository ; 
	
	
	@Override
	public Users process(Users user) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<Users> testUser = accountRepository.findById(user.getUserId()) ; 
		
		
		  if(testUser.isPresent()) { 
			  user.setAccount(user.getAccount().add(testUser.get().getAccount()));
		  }
		  
		  return user ; 
	}

}
