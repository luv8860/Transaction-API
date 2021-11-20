package com.rapipay.transactions.controller;
import java.util.List;

import com.rapipay.transactions.model.Agent;
import com.rapipay.transactions.services.AgentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/agent")
public class AgentController {
    @Autowired
	private AgentService agentServices;

    @PostMapping("/addAgent")
	public ApplicationResponseEntity<Agent> addAgent(@RequestBody Agent agent) {
		try {	
			agentServices.addAgent(agent);
			return new ApplicationResponseEntity<>("200","Success",agent);
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	
	}

    @PutMapping("/editAgent")
	public ApplicationResponseEntity<Agent> editAgent(@RequestBody Agent agent) {
		try {	
			agentServices.editAgent(agent);
			return new ApplicationResponseEntity<>("200","Success",agent);
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	}

	@DeleteMapping("/deleteAgent")
	public ApplicationResponseEntity<String> deleteAgent(@RequestBody Agent agent) {
		try {	
			String value=agentServices.deleteAgent(agent);
			return new ApplicationResponseEntity<>("200","Success",value);
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	}

	@GetMapping("/showAllAgent")
	public ApplicationResponseEntity<List<Agent>> showAllAgent() {
		try {	
			return new ApplicationResponseEntity<>("200","Success",agentServices.showAllAgent());
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	
	}
}
