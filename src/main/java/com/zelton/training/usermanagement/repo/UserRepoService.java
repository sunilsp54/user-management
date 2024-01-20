package com.zelton.training.usermanagement.repo;

import com.zelton.training.usermanagement.domain.User;

public interface UserRepoService {
	
	public User findUserById(String userId);

}
