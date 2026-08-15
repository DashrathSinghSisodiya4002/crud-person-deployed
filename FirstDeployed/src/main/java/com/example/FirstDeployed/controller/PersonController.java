package com.example.FirstDeployed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstDeployed.entity.Person;
import com.example.FirstDeployed.service.PersonService;


@RestController
@RequestMapping("/Person")
@CrossOrigin("*")
public class PersonController {
	
	@Autowired
	private PersonService service;
	 
    // get All 
	@GetMapping
	public ResponseEntity<List<Person>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
	}

	// get One 
	@GetMapping("/{id}")
	public  ResponseEntity<Person> getOne(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.getOne(id));
	}

	// Create user
	@PostMapping
	public ResponseEntity<Person> save(@RequestBody Person pr) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.Create(pr));
	}
    
	// Update Users 
	@PutMapping("/{id}")
	public ResponseEntity<Person>update(@PathVariable Long id, @RequestBody Person pr) {
		return ResponseEntity.status(HttpStatus.OK).body(service.update(id, pr));
	}

	// Delete users
	@DeleteMapping("/{id}")
	public ResponseEntity <String> delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));
	}

	

}
