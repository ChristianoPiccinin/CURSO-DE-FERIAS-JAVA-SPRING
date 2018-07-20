package br.univille.teste.service.proposal.calculation;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.univille.teste.model.Vehicle;
import br.univille.teste.vo.ProposalVO;

@Component
public  class AssistanceCalculation extends CoverageCalculation {

	float calculateValue(ProposalVO proposal) {

		return 0;
	}

	@Override
	float calculateVehiclePercent(ProposalVO proposal) {
		
		Vehicle vehicle = proposal.getVehicle();
		
		int vehicleAge = (new Date().getYear()) - proposal.getVehicle().getAssemblyYear();
		
		float percent = 0;
		if (vehicleAge < 5) {
			percent = 0.01f; //baixo
		} else if (vehicleAge >= 5 && vehicleAge < 10) { 
			percent = 0.02f; //alto
		} else if (vehicleAge >= 11) { 
			percent = 0.1f; //muito alto
		} else {
			percent = 0.2f; //Fudeuuu
		}
		return percent;

	}
	
}
