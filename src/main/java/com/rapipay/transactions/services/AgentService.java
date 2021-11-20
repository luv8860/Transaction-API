package com.rapipay.transactions.services;

import java.util.List;

import com.rapipay.transactions.exceptions.UserNotFoundException;
import com.rapipay.transactions.model.Agent;

public interface AgentService {

    public Agent addAgent(Agent agent);
    public Agent editAgent(Agent agent)  throws UserNotFoundException;
    public String deleteAgent(Agent agent);
    public List<Agent> showAllAgent();
}
