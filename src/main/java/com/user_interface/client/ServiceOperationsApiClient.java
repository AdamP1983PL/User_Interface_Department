package com.user_interface.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "${service-operations.application.name}")
public interface ServiceOperationsApiClient {



}
