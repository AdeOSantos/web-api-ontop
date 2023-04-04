package com.ontop.webapi.webapiontop;

public class Transaction {

    private int wallet_transaction_id;

    private int amount;

    private int user_id;

    public Transaction() {
    }
    public int getWallet_transaction_id() {
        return wallet_transaction_id;
    }

    public void setWallet_transaction_id(int wallet_transaction_id) {
        this.wallet_transaction_id = wallet_transaction_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

}