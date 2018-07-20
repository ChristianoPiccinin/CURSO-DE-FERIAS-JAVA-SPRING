package br.univille.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.teste.model.Customer;
import br.univille.teste.repository.CustomerRepository;

@RestController
@RequestMapping("customer")
public class CustomerController {
	

	
	@Autowired
	private CustomerRepository repository;
	
	@GetMapping("/ok")
	public String testeCustomer(){
		return "Customer Está Ok!";
	}
	
	@PostMapping("/save")
	public Customer save(@RequestBody Customer customer){
		return repository.saveAndFlush(customer);
	}
	
	@GetMapping("/list")
	public List<Customer> list(){
		return repository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id){
		repository.deleteById(id);
		return ResponseEntity.ok("Registro deletado em Customer");
	}
	
	
	/***
	@GetMapping("/findID/{id}")
	public ResponseEntity<String> findID(@PathVariable("id") long id){
		repository.findById(id);
		return(	repository.(id));
	
	}
	***/
	
	
	@PutMapping
	public Customer update(@RequestBody Customer customer){
		return repository.saveAndFlush(customer);
	}
	
	/*
	@GetMapping("add/{name}")
	public Customer save(
			@PathVariable("name") String name){
		
		Customer customer = new Customer();
		customer.setName(name);
		
		return repository.saveAndFlush(customer);
		
	}*/
}

	
	