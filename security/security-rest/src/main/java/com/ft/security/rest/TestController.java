package com.ft.security.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/security/test")
@Api("测试专用")
public class TestController {
	
	@RequestMapping(value = "helloWorld", method = RequestMethod.GET)
	@ApiOperation(value = "helloWorld测试")
	public String helloWorld() throws Exception {		
		System.out.println("Hello world ................!");
		return "helloWorld";
	}
}
