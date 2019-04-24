package com.example.projectbackend.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectbackend.User;

@RestController
public class ApiController {

	@RequestMapping(value="/api/getDate", produces = "application/json")
	public Object getDate() {
		
		User user = new User();
		user.setId(1);
		user.setName("blob");
		return user; 
	}
}
