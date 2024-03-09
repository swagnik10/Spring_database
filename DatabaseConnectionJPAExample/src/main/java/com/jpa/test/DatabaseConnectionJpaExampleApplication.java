package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class DatabaseConnectionJpaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DatabaseConnectionJpaExampleApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
//		User user=new User();
//		user.setName("Swagnik");
//		user.setCity("Kolkata");
//		user.setStatus("I am a java developer");
//		
//		
//		User user1=userRepository.save(user);
//		System.out.println(user1);
		
		//Creating users
		
//		User user1=new User();
//		user1.setName("Kunal");
//		user1.setCity("Bangalore");
//		user1.setStatus("I am a python programmer");
//		
//		User user2=new User();
//		user2.setName("Sima");
//		user2.setCity("Mumbai");
//		user2.setStatus("I am a C# programmer");
//		
//		User user3=new User();
//		user3.setName("Riya");
//		user3.setCity("Hydrabad");
//		user3.setStatus("I am a sql programmer");
//		
//		User user4=new User();
//		user4.setName("Alex");
//		user4.setCity("Chennai");
//		user4.setStatus("I am a .net programmer");
//		
////		single user save
//		//User u1=userRepository.save(user1);
//		
//		//multiple user save
//		List<User> create=List.of(user1,user2,user3,user4);
//		
//		Iterable<User> itr=userRepository.saveAll(create);
//		
//		itr.forEach(swag->System.out.println(swag));
//		
//		System.out.println("Created");
		
		
		
		//Update of a user
		
//		Optional<User> optional=userRepository.findById(1);
//		User u1=optional.get();
//		u1.setName("Swagnik Ghosh");
//		userRepository.save(u1);
//		System.out.println("Data updated");
		
		//Display the details of user
		
		//Iterable<User> itr=userRepository.findAll();
		
		//display by old method
//		Iterator<User> iterator=itr.iterator();
//		while(iterator.hasNext()) {
//			User user=iterator.next();
//			System.out.println(user);
//		}
		
		//display by foreach() & consumer
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		//display by foreach lamda function swag->
		//itr.forEach(swag->System.out.println(swag));
		
		//delete the user 
		
		//delete single user
		//userRepository.deleteById(5);
		
		//delete multiple user
		//userRepository.deleteAll();
		
//		Iterable<User> itr1=userRepository.findAll();
//		userRepository.deleteAll(itr1);
	
		
		//System.out.println("Deleted");
		
		
		
		
		
		
		
	}

}
