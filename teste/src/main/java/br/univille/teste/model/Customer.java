package br.univille.teste.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.univille.teste.enums.MaritalStatus;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Builder
@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString


public class Customer  {
	//private static final long serialVersionUID = 1099189656054852009L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(length = 11,
			updatable=false,
			nullable=false,
			name="cadastropessoafisica",
			unique=true)
	private String cpf;
	
	
	@Column(length=50)
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	
	private String email;
	
	private boolean livesWiththeRickRange;

	@Embedded
	private DrivingLicense drivingLicense;
}