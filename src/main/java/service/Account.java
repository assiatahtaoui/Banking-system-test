package service;

public class Account {
   // current balance
    private int balance;
    //List to store all account transactions
    private List<Transaction> trs=new ArrayList<>();

    // deposit money inte the account
    public void deposit(int amount, String date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must not be 0 or less");
        }
        // updating balance
        balance += amount;

        // store the new balance
        trs.add(new Transaction(amount, date, balance));
    }
    // withdraws money
    public void withdraw(int amount, String date) {
        // withdawal must be greater than 0
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        //conditions: the withdraw cannot be more than the current balance
        if(amount > balance) {
            throw new IllegalArgumentException("insufficient balance");
        }
        // updating balance
        balance -= amount;
        trs.add(new Transaction(-amount, date, balance));
    }

    // prints the bank statement : displays : date, transaction amount, balance
    public void printStatement(){

        // printing statement header
        System.out.println("Date       || Amount   ||   balance");

        // displaying transactions from most recent to the old
        for (int i=trs.size()-1; i>=0; i--) {
            Transaction t=trs.get(i);
            System.out.println(t.getDate()+" || "+ t.getAmount()+  "   ||  "+t.getBalance());
        }
}
