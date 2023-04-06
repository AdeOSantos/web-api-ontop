package model;

public class Account {

    private int user_id;

    private String name;

    private String surname;

    private int routingNumber;

    private int nationalId;

    private int accountNumber;

    private String bankName;

    public Account() {
    }

    public Account(int user_id,String name, String surname, int routingNumber, int id,
                           int accountNumber, String bankName) {

        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.routingNumber = routingNumber;
        this.nationalId = id;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
