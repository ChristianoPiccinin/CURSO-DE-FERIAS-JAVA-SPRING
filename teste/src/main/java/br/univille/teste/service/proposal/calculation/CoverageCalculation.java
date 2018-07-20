package br.univille.teste.service.proposal.calculation;

import br.univille.teste.model.Vehicle;
import br.univille.teste.vo.ProposalVO;

public abstract class CoverageCalculation {

	public float calcute(ProposalVO proposal) {
		Vehicle vehicle = proposal.getVehicle();
		return calculateValue(proposal) + (calculateVehiclePercent(proposal) * vehicle.getPrice());
	}

	abstract float calculateValue(ProposalVO proposal);

	abstract float calculateVehiclePercent(ProposalVO proposal);

}
