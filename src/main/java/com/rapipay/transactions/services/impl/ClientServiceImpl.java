package com.rapipay.transactions.services.impl;

import java.util.List;

import com.rapipay.transactions.exceptions.UserNotFoundException;
import com.rapipay.transactions.model.Client;
import com.rapipay.transactions.repository.ClientRepository;
import com.rapipay.transactions.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    ClientRepository clientRepo;

    @Override
    public Client addAgent(Client client) {
        // TODO Auto-generated method stub
        this.clientRepo.save(client);
        return client;
    }

    @Override
    public Client editAgent(Client client)throws UserNotFoundException {
        // TODO Auto-generated method stub
        Client findClient=this.clientRepo.findById(client.getClientID()).orElseThrow(()->new UserNotFoundException());
        this.clientRepo.save(client);
        return client;
    }

    @Override
    public String deleteAgent(Client client){
        // TODO Auto-generated method stub
        this.clientRepo.delete(client);
        return "Succesull";
    }

    @Override
    public List<Client> showAllAgent() {
        // TODO Auto-generated method stub
        return this.clientRepo.findAll();
    }
    
}
