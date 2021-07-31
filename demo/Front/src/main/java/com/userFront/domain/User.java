package com.userFront.domain;

import java.util.List;

public class User {
    private long userID;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWorld;
    private String email;
    private String phoneNumber;
    private boolean enable=true;
    private checkingAccount checkingAccount;
    private savingAccount savingAccount;
    private List<Appointment> appointmentList;
    private List<Recipient> recipientList;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public checkingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(checkingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public savingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(savingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<Recipient> getRecipientList() {
        return recipientList;
    }

    public void setRecipientList(List<Recipient> recipientList) {
        this.recipientList = recipientList;
    }
}
