package com.venkat.mohan1;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.mohan2.MyOwnProperties;

@RestController
public class HelloWorld {
	
	@Resource
	private MyOwnProperties myOwnProperties;
	@RequestMapping("/hello")
	public int hello() {
		return myOwnProperties.getPort();
	}

}
