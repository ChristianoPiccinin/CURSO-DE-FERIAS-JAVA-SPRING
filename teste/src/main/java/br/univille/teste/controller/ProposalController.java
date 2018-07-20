package br.univille.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.teste.model.Insurance;
import br.univille.teste.service.proposal.ProposalService;
import br.univille.teste.vo.ProposalVO;

@RestController
@RequestMapping("proposal")
public class ProposalController {
	
	@Autowired
	private ProposalService service;
	
	
	@GetMapping("/teste")
	public String teste(){
		
		return("asdasdasdasd");
	}
	
	@PostMapping("/calculate")
	public Insurance calculate (@RequestBody ProposalVO proposalVO){
		
		return service.calculate(proposalVO);
	}
			
}
