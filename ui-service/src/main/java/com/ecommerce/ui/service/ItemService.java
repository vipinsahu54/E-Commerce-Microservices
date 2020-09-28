package com.ecommerce.ui.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="ACCOUNT-SERVICE")
public interface ItemService {

}
