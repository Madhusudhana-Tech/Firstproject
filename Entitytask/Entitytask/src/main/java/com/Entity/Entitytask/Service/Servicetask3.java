package com.Entity.Entitytask.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Entitytask.Entity.Entitytask3;
import com.Entity.Entitytask.Respositry.Respositrytask3;
@Service
public class Servicetask3 {
	@Autowired
private Respositrytask3 library;
	
	
public Entitytask3 savename(Entitytask3 lib) {
	return library.save(lib);
	
}
public List<Entitytask3>getAllUser(){
	return library.findAll();
}
public Optional<Entitytask3>getAllUser(Long id){
	return library.findById(id);
}
}


