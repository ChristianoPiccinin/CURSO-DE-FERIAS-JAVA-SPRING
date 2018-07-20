package br.univille.teste.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import br.univille.teste.enums.Service;
import br.univille.teste.model.Provider;
import br.univille.teste.repository.ProviderRepository;


@RestController
@RequestMapping("provider")
public class ProviderController {
	
	@Autowired
	private ProviderRepository repository;
	
	@GetMapping("/olamundo")
	public String olamundo(){
		return "Olá Mundo!";
	}
	
	
	@PostMapping("/save")
	public Provider save(@RequestBody Provider provider){
		return repository.saveAndFlush(provider);
	}
		
	
	@GetMapping("/list")
	public List<Provider> list(){
		return repository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id){
		repository.deleteById(id);
		return ResponseEntity.ok("registro deletado o encontrado em Provider");
	}
	
	@PutMapping
	public Provider update(@RequestBody Provider provider){
		return repository.saveAndFlush(provider);
	}
	
		
	@GetMapping("add/{name}/{service}")
	public Provider save(
			@PathVariable("name") String name,
			@PathVariable("service") Service service){
		
		Provider provider = new Provider();
		provider.setName(name);
		Set<Service> services = new HashSet<>();
		services.add(service);
		provider.setServices(services);
		return repository.saveAndFlush(provider);
		
	}
}
