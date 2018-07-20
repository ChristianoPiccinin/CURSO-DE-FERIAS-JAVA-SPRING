package br.univille.teste.model;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.univille.teste.enums.DrivingCategory;

public class DrivingLicense {
	@Temporal(TemporalType.DATE)
	private Date firstLicenseDate;
	
	@Enumerated(EnumType.STRING)
	private DrivingCategory drivingCategory;
	
	@Temporal(TemporalType.DATE)
	private Date licenseExpiration;
	

}
