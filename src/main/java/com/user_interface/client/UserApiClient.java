package com.user_interface.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "${user-department.application.name}")
public interface UserApiClient {

        /*@Controller in AdminController...*/

}
