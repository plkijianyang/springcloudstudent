package com.spring.cloud.ServiceRibbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

/**
 * @Author:wjy
 * @Date: 2018/12/6.
 */
@Service
public class HelloService {

	@Resource
	RestTemplate restTemplate;

	public String hiService(String name){
		return restTemplate.getForObject("http://SERVICE-PRO/test?name="+name,String.class);
	}
}
