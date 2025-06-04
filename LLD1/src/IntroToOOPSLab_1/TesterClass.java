package IntroToOOPSLab_1;

public class TesterClass {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0, "Tejveer");
        account.deposit(100);
        account.deposit(200);
        account.withdraw(10);
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(600);
        account.printTransactionHistory();
    }
}
