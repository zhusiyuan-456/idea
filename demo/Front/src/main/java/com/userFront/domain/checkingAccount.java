package com.userFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class checkingAccount {
    private long ID;
    private  int accountNumber;
    private BigDecimal accountBalance;
    private List<checkingTransaction> checkingTransactionList;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<checkingTransaction> getCheckingTransactionList() {
        return checkingTransactionList;
    }

    public void setCheckingTransactionList(List<checkingTransaction> checkingTransactionList) {
        this.checkingTransactionList = checkingTransactionList;
    }
}
