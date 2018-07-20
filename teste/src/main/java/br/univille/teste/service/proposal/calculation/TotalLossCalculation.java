package br.univille.teste.service.proposal.calculation;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.univille.teste.model.Customer;
import br.univille.teste.vo.ProposalVO;

@Component
public class TotalLossCalculation extends CoverageCalculation {

	@Override
	float calculateValue(ProposalVO proposal) {
		return 0;
	}

	@Override
	float calculateVehiclePercent(ProposalVO proposal) {
		Customer customer = proposal.getCustomer();
		int age = (new Date().getYear()) - customer.getBirthDate().getYear();
		
		
		float percent = 0;
		if (age < 24) {
			percent = 0.05f;
		} else if (age >= 24 && age < 40) {
			percent = 0.03f;
		} else {
			percent = 0.01f;
		}
		return percent;
	}

}
