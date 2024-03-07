package com.nocountry.professionalIT.service;

import java.util.List;

public interface ICrud<T> {

	List<T> getAll();
    
	T get(Long id);
	    
	void create(T t);
	    
	void edit(T t);
	    
	void delete(Long id);
	
}
