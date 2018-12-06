package com.spring.cloud.ServiceRibbon.controller;

import com.spring.cloud.ServiceRibbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:wjy
 * @Date: 2018/12/6.
 */
@RestController
public class HelloControler {

	@Resource
	private HelloService helloService;

	@GetMapping(value = "/hi")
	public String hi(String name){
		return helloService.hiService(name);
	}
}
