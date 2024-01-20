package com.zelton.training.usermanagement.repo.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zelton.training.usermanagement.domain.User;
import com.zelton.training.usermanagement.repo.UserRepoService;

@Repository
public class UserRepoImpl implements UserRepoService{

	Map<String, User> usersMap = new HashMap<>();
	
	
	@Autowired
	public UserRepoImpl() {
		super();
		User user = new User("id1", "Sunil", 35,"m1");
		usersMap.put(user.getId(), user);	
		
		User user2 = new User("id2", "U2", 35,"m2");
		usersMap.put(user2.getId(), user2);	
	}

	@Override
	public User findUserById(String userId) {
	
		return usersMap.get(userId);
	}

}
