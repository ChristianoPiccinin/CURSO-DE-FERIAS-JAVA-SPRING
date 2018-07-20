package br.univille.teste.vo;

import java.util.Set;

import br.univille.teste.enums.Coverage;
import br.univille.teste.model.Customer;
import br.univille.teste.model.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProposalVO {

	private Customer customer;
	private Vehicle vehicle;
	private Set<Coverage> coverages;
}
