package com.hemoraledev.demoapi.service;

import java.util.List;


public interface BasicService<Dto, Id> {
	
	Dto create(Dto dto);
	
	Dto getElementById(Id id);
	
	List<Dto> getAllElements();
}
