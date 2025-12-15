package app;

public class Test {
   public static void main(String[] args) {
        Account acc = new Account();

        acc.deposit(1000,"10-01-2012");
        acc.deposit(2000,"13-01-2012");
        acc.withdraw(500, "14-01-2012");

        acc.printStatement();

    }
}
