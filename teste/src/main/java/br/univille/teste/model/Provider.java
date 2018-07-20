package br.univille.teste.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import br.univille.teste.enums.Service;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Provider {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@ElementCollection(targetClass =  Service.class)
	@JoinTable(name="provider_service", joinColumns = @JoinColumn(name="provider_id"))
	@Column(name="service", nullable=false)
	@Enumerated(EnumType.STRING)
	private Set<Service> services;
	


}
