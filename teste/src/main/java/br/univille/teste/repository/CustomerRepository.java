package br.univille.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.teste.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {

	Customer findByCpfAndId(String cpf, int id);
	Customer findByCpf(String cpf);
	
	
}
