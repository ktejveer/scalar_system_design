package IntroToOOPSLab_1;

public class BankAccount {
    private double balance;
    private String ownerName;

    public void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
        }else{
            System.out.println("Amount is negative");
        }
    }

    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }else{
            balance = balance - amount;
        }
    }
}
