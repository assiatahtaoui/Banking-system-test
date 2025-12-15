package model;

public class Transaction {
    private String date;
    private int amount;
    private int balance;



    public Transaction(int amount, String date, int balance) {
        this.amount = amount;
        this.date = date.toString();
        this.balance = balance;

    }
    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
    public int getBalance() {
        return balance;
    }
}
