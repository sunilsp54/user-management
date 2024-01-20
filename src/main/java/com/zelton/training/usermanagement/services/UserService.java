package com.zelton.training.usermanagement.services;

import java.util.List;

import com.zelton.training.usermanagement.domain.User;
import com.zelton.training.usermanagement.web.resources.UserResource;

public interface UserService {
	
//	public User createUser(User user);
//	public List<User> getUsers(String merchantId);
//	public User getUserByEmail(String email);
	public UserResource getUserById(String userId);
//	public User updateUser(User user);

}
