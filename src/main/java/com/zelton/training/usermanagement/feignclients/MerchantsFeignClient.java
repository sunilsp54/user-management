package com.zelton.training.usermanagement.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zelton.training.usermanagement.domain.Merchant;

@FeignClient(value = "merchant-management")
public interface MerchantsFeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "/merchants/{merchantId}")
	public Merchant findMerchant(@PathVariable String merchantId);
}
