package com.rapipay.transactions.repository;
import com.rapipay.transactions.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends  JpaRepository<Client,Integer>{

}
