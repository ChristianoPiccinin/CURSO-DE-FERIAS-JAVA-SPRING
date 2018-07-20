package br.univille.teste.service.proposal;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.teste.enums.Coverage;
import br.univille.teste.model.Customer;
import br.univille.teste.model.Insurance;
import br.univille.teste.model.Vehicle;
import br.univille.teste.repository.CustomerRepository;
import br.univille.teste.repository.InsurangeRepository;
import br.univille.teste.vo.ProposalVO;


@Service
public class ProposalService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private InsurangeRepository insuranceRepository;
	
	@Autowired
	private CoverageCalculationFactory factory;
	
	public  Insurance calculate(ProposalVO proposal) {
		float insurancePrice = 0;
		for (Coverage coverage : proposal.getCoverages()) {
			insurancePrice += factory.build(coverage).calcute(proposal);
		}
		
		return save(proposal.getCustomer(),
				proposal.getVehicle(),
				proposal.getCoverages(),
				insurancePrice);
	}
	
	public Insurance save(Customer customer,
			Vehicle vehicle, 
			Set<Coverage> coverages,
			float insurancePrice){
		Customer existsCustomer = customerRepository.findByCpf(customer.getCpf());
		if (existsCustomer == null){
			existsCustomer = customerRepository.save(customer);
		}
		
		Insurance insurance = Insurance.builder()
		.customer(existsCustomer)
		.vehicle(vehicle)
		.coverages(coverages)
		.insurancePrice(insurancePrice).build();
		
		return insuranceRepository.save(insurance);
		
		
	}
	
	
	
}	
