package com.zelton.training.usermanagement.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zelton.training.usermanagement.domain.Merchant;
import com.zelton.training.usermanagement.domain.User;
import com.zelton.training.usermanagement.feignclients.MerchantsFeignClient;
import com.zelton.training.usermanagement.repo.UserRepoService;
import com.zelton.training.usermanagement.services.UserService;
import com.zelton.training.usermanagement.web.resources.UserResource;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepoService userRepo;

	@Autowired
	private MerchantsFeignClient merchantsFeignClient;
	
	@Override
	public UserResource getUserById(String userId) {
		
		User user= userRepo.findUserById(userId);
		Merchant merchant=merchantsFeignClient.findMerchant(user.getMerchantId());
		
		UserResource userResource = new UserResource();
		BeanUtils.copyProperties(user, userResource);
		userResource.setMerchant(merchant);
		
		return userResource;
	}

}
