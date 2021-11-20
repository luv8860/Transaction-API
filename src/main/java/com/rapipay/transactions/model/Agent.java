package com.rapipay.transactions.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Agent {

    @Id
    int agentID; 
    @Column(name="name")   
    String name;
    @Column(name="state")
    String state;
    @Column(name="transaction_id")
    String transactionID;
    @Column(name="balence")
    int balence;
    @Column(name="transaction_amount")
    int transactionAmount;

}
