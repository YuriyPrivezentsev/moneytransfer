package com.lucky.moneytransfer.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GenericTransferManager implements TransferManager {
    public String getBalance(String uid){
        return "Hello " + uid;
    }
}
