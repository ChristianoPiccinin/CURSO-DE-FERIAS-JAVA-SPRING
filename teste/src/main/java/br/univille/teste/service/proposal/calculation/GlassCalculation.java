package br.univille.teste.service.proposal.calculation;

import org.springframework.stereotype.Component;

import br.univille.teste.vo.ProposalVO;

@Component
public class GlassCalculation extends TotalLossCalculation {

	@Override
	public float calcute(ProposalVO proposal) {
		//valor do seguro do vidro será de 5 % do valor do carro
		return super.calcute(proposal) * 0.05f;
	}
	
	
}
