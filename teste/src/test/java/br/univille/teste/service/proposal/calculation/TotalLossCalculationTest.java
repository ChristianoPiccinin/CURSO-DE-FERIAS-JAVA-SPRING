package br.univille.teste.service.proposal.calculation;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.univille.teste.model.Customer;
import br.univille.teste.model.Vehicle;
import br.univille.teste.vo.ProposalVO;

public class TotalLossCalculationTest {

	@Test
	public void testVidaLoka() {
		Customer customer = Customer.builder().birthDate(new Date(2000-1900, 10, 1)).build();
		Vehicle vehicle = Vehicle.builder().assemblyYear(2014).price(10000).build();
		ProposalVO proposal = ProposalVO.builder().customer(customer).vehicle(vehicle).build();
		TotalLossCalculation calculation = new TotalLossCalculation();

		float insurancePrice = calculation.calcute(proposal);
		
		Assert.assertEquals(500, insurancePrice, 0);
	}
	
}
