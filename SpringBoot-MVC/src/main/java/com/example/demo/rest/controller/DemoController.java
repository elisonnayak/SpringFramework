package com.example.demo.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoModel;

@RestController
public class DemoController {
	
	@Autowired
	DemoModel model;
	
	@RequestMapping("/hello")
	public DemoModel hello() {
		model.setAge(25);
		model.setName("Elison Nayak");
		model.setGender("Male");
		return model;
	}

}
