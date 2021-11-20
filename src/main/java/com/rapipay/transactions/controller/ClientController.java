package com.rapipay.transactions.controller;
import java.util.List;

import com.rapipay.transactions.model.Client;
import com.rapipay.transactions.services.ClientService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/client")
public class ClientController {
    @Autowired
	private ClientService clientServices;

    @PostMapping("/addClient")
	public ApplicationResponseEntity<Client> addAgent(@RequestBody Client client) {
		try {	
			clientServices.addAgent(client);
			return new ApplicationResponseEntity<>("200","Success",client);
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	
	}

    @PutMapping("/editClient")
	public ApplicationResponseEntity<Client> editAgent(@RequestBody Client client) {
		try {	
			clientServices.editAgent(client);
			return new ApplicationResponseEntity<>("200","Success",client);
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/deleteClient/{id}")
	public ApplicationResponseEntity<String> deleteAgent(@PathVariable(value="id") long productID) {
		try {	
			// String value=clientServices.deleteAgent(client);
			return new ApplicationResponseEntity<>("200","Success","abcd");
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	}

	@GetMapping("/showAllClient")
	public ApplicationResponseEntity<List<Client>> showAllAgent() {
		try {	
			return new ApplicationResponseEntity<>("200","Success",clientServices.showAllAgent());
		}
		catch(Exception e){
			e.printStackTrace();
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	
	}
}
