package net.javaguide.springboot.service;

import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Role;
import net.javaguide.springboot.model.User;
import net.javaguide.springboot.repository.UserRepository;
import net.javaguide.springboot.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new  User(registrationDto.getFirstname(), 
				registrationDto.getLastname(), registrationDto.getEmail(), 
				registrationDto.getPassword(),Arrays.asList(new Role("ROLE_USER")));
				
		return userRepository.save(user);
	}

	public UserServiceImpl() {
		super();
	}

}
