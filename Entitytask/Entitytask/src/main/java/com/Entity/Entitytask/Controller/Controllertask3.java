package com.Entity.Entitytask.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Entitytask.Entity.Entitytask3;
import com.Entity.Entitytask.Service.Servicetask3;

@RestController
@RequestMapping("/Controller")
public class Controllertask3 {
@Autowired
private Servicetask3 servicetask3;
@PostMapping("/save")
public Entitytask3 savelibrary(@RequestBody Entitytask3 library) {
	return servicetask3.savename(library);
}
@GetMapping("/getting")
public List<Entitytask3>getAllUser(){
	return servicetask3.getAllUser();
}
@GetMapping("/save/{id}")
	public Optional<Entitytask3>getUserById(@PathVariable Long id){
		return servicetask3.getAllUser(id);
	}

}

