package IntroToOOPSLab_1;

public class BankAccount {
    private double balance;
    private String ownerName;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
        }else{
            System.out.println("Amount is negative");
        }
    }

    public void withdraw(int amount){
        if(amount > balance && amount > 0){
            System.out.println("Insufficient balance");
        }else{
            balance = balance - amount;
        }
    }
}
