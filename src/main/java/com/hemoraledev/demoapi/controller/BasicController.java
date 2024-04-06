package com.hemoraledev.demoapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


public interface BasicController<Dto, Id> {
	
	@PostMapping(produces = "application/json")
	@ResponseBody Dto create(@RequestBody Dto dto);
	
	@GetMapping(path = "/{id}",  produces= "application/json")
	Dto getElementById(@PathVariable(value = "id") Id id);
	
	@GetMapping(produces = "application/json")
	@ResponseBody List<Dto> getAllElements();
}
