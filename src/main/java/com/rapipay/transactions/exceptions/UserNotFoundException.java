package com.rapipay.transactions.exceptions;

public class UserNotFoundException extends Exception{

    @Override
    public String toString() {
        return "User Not Found";
    }
    
    
}
