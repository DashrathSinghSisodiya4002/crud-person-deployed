package com.example.FirstDeployed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstDeployed.entity.Person;
import com.example.FirstDeployed.error.PersonNotFound;
import com.example.FirstDeployed.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repo;
	
	//Crete
	public Person Create(Person pr) {
		return repo.save(pr);
	}
    
	//geALL
	public List<Person>getAll(){
		return repo.findAll();
	}
	
	// get one by id
	public Person getOne(Long id) {
		return repo.findById(id).orElseThrow(()->new PersonNotFound("Person not found this id"));
	}
	// get Update
	public Person update(Long id, Person pr) {
		return repo.findById(id).map((a) -> {
			a.setName(pr.getName());
			a.setDob(pr.getDob());
			a.setEmail(pr.getEmail());
			a.setGender(pr.getGender());
			
			
			return repo.save(a);
		}).orElseThrow(() -> new PersonNotFound("Person not found this id :"));
	}
	
	//Delete
	public String delete(Long id ) {
	 repo.deleteById(id);
	 return "Delete Successfully..";
		
	}

	

}
