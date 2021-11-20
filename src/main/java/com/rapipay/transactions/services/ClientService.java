package com.rapipay.transactions.services;

import java.util.List;

import com.rapipay.transactions.exceptions.UserNotFoundException;
import com.rapipay.transactions.model.Client;
public interface ClientService {
    
    public Client addAgent(Client client);
    public Client editAgent(Client client) throws UserNotFoundException;
    public String deleteAgent(Client client);
    public List<Client> showAllAgent();
}
