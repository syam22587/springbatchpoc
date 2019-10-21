package com.newkuar.springbatchpoc.accountbatch;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.Resource;

import com.newkuar.springbatchpoc.entity.Users;



public class AccountReader extends FlatFileItemReader<Users> {

	public AccountReader(Resource resource) {
		super();

		setResource(resource);

		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setNames(new String[] { "userid", "name", "dept", "amount" });
		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);

		BeanWrapperFieldSetMapper<Users> beanMapper = new BeanWrapperFieldSetMapper<>();
		
		beanMapper.setTargetType(Users.class);
		
		DefaultLineMapper<Users> defaultMapper = new DefaultLineMapper<>();
		defaultMapper.setLineTokenizer(lineTokenizer);
		defaultMapper.setFieldSetMapper(beanMapper);
		
		setLineMapper(defaultMapper);
		}

}
