package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@SpringBootApplication
public class DbConnectionApplication implements CommandLineRunner {

	@Autowired
	UserRepo ob;

	public static void main(String[] args)  {
		SpringApplication.run(DbConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User record=new User(1,"Aayush");
		ob.save(record);
		Optional<User> record1 = ob.findById(1);

		record1.stream().forEach(e->{
			System.out.print(e.id+" "+e.name);
		});

	}

}
