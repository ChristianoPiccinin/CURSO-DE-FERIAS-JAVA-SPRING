package br.univille.teste.enums;

import lombok.Getter;

@Getter
public enum Coverage {
	TOTAL_LOSS(Service.GUINCHO, Service.TAXI, Service.OFICINA),
	THIRDY_PARTY(Service.OFICINA),
	ASSISTANCE(Service.GUINCHO, Service.COMBUSTIVEL),
	GLASS(Service.PARABRISA, Service.RETROVISOR, Service.LANTERNA),
	BACKUP_CAR(Service.CARRO_RESERVA);
	
	private Service[] services;

	private Coverage(Service... services){
		this.services = services;
	}
}
