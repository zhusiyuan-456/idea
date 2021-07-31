package com.userFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class savingAccount {
    private long ID;
    private  int accountNumber;
    private BigDecimal accountBalance;

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

    public List<savingTransaction> getSavingTransactionList() {
        return savingTransactionList;
    }

    public void setSavingTransactionList(List<savingTransaction> savingTransactionList) {
        this.savingTransactionList = savingTransactionList;
    }

    private List<savingTransaction> savingTransactionList;
}
