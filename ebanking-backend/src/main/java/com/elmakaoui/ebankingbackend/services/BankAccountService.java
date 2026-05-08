package com.elmakaoui.ebankingbackend.services;

import com.elmakaoui.ebankingbackend.entities.BankAccount;
import com.elmakaoui.ebankingbackend.entities.CurrentAccount;
import com.elmakaoui.ebankingbackend.entities.Customer;
import com.elmakaoui.ebankingbackend.entities.SavingAccount;
import com.elmakaoui.ebankingbackend.exceptions.BalanceNotSufficientException;
import com.elmakaoui.ebankingbackend.exceptions.BankAccountNotFoundException;
import com.elmakaoui.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<Customer> listCustomers();
    BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;
    List<BankAccount> bankAccountList();
}
