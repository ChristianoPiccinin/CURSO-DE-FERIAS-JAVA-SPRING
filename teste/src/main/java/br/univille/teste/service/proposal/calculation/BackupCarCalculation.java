package br.univille.teste.service.proposal.calculation;

import org.springframework.stereotype.Component;

import br.univille.teste.vo.ProposalVO;

@Component
public class BackupCarCalculation extends CoverageCalculation {

	@Override
	float calculateValue(ProposalVO proposal) {
		return 100;
	}

	@Override
	float calculateVehiclePercent(ProposalVO proposal) {
		return 0;
	}

}
