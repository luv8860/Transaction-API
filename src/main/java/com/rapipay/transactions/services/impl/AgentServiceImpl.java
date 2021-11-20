package com.rapipay.transactions.services.impl;

import java.util.List;

import com.rapipay.transactions.exceptions.UserNotFoundException;
import com.rapipay.transactions.model.Agent;
import com.rapipay.transactions.repository.AgentRepository;
import com.rapipay.transactions.services.AgentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentServiceImpl implements AgentService{

    @Autowired
    AgentRepository agentRepo;

    @Override
    public Agent addAgent(Agent agent) {
        // TODO Auto-generated method stub
        this.agentRepo.save(agent);
        return agent;
    }

    @Override
    public Agent editAgent(Agent agent) throws UserNotFoundException{
        // TODO Auto-generated method stub
        Agent findAgent=this.agentRepo.findById(agent.getAgentID()).orElseThrow(()->new UserNotFoundException());
        this.agentRepo.save(agent);
        return agent;
    }

    @Override
    public String deleteAgent(Agent agent) {
        // TODO Auto-generated method stub
        this.agentRepo.delete(agent);
        return "Succesull";
    }

    @Override
    public List<Agent> showAllAgent() {
        // TODO Auto-generated method stub
        return this.agentRepo.findAll();
    }

    
}
