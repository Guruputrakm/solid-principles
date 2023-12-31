package com.solidprinciple.singleresponsibility.service;

import com.solidprinciple.singleresponsibility.pojo.Account;

public class TransactionService {

    AccountService accountService;

    public void withdraw(Account account, double amountToWithDraw) {
        accountService.updateBalance(account,amountToWithDraw);
    }

    public void deposit(Account account, double amountToBeDeposited) {
        accountService.deposit(account, amountToBeDeposited);
    }
}
