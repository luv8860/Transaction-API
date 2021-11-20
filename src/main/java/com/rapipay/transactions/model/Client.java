package com.rapipay.transactions.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Client {
    @Id
    int clientID;
    @Column(name="productName")    
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
