package net.javaguide.springboot.service;

import net.javaguide.springboot.model.User;
import net.javaguide.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
