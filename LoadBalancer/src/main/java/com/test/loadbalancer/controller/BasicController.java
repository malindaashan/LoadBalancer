package com.test.loadbalancer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String returnTest() {
		return"AAAAAAA";
	}
}
