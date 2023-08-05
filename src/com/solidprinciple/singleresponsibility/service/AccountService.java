package com.solidprinciple.singleresponsibility.service;

import com.solidprinciple.singleresponsibility.pojo.Account;
import com.solidprinciple.singleresponsibility.pojo.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class AccountService {

    private Random random = new Random();

    private List<Account> accounts = new ArrayList<>();

    public Account openAccount(String name, double openingBalance, Address address) {
        Account account = Account.builder()
                .accountName(name)
                .address(address)
                .balance(openingBalance)
                .accountNumber(random.nextLong())
                .build();
        accounts.add(account);
        return account;
    }

    public boolean updateBalance(Account account, double balance) {
        Double currentBalance = getAccount(account.getAccountNumber()).map(a -> a.getBalance()).findFirst().get();
        if(currentBalance > balance) {
            return getAccount(account.getAccountNumber()).map(a -> {
                a.setBalance(currentBalance-balance);
                return true;
            }).findFirst().get();
        } else {
            return false;
        }
    }
    public Account updateAccountAddress(Account account, Address address) {
        getAccount(account.getAccountNumber()).forEach(a -> a.setAddress(address));
        return account;
    }

    private Stream<Account> getAccount(Long accountNumber){
        return accounts.stream().filter(account -> account.getAccountName().equals(accountNumber));
    }

}
