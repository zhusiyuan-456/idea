package com.userFront.domain;

import java.math.BigDecimal;
import java.util.Date;

public class savingTransaction {
    private long ID;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;
    private savingAccount savingAccount;

    public savingTransaction(){}

    public savingTransaction(Date date, String description, String type, String status, double amount,
                               BigDecimal availableBalance, com.userFront.domain.savingAccount savingAccount) {
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.savingAccount= savingAccount;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public com.userFront.domain.savingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(com.userFront.domain.savingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
}
