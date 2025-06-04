package IntroToOOPSLab_1;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private String ownerName;
    ArrayList<String> log = new ArrayList<>();

    BankAccount(){

    }

    BankAccount(double balance, String ownerName){
        this.balance = balance;
        this.ownerName = ownerName;
    }

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
            log.add("Depositing "+amount +" "+ ownerName);
            balance = balance + amount;
        }else{
            System.out.println("Amount is negative");
        }
    }

    public void withdraw(int amount){
        if(amount > balance && amount > 0){
            System.out.println("Insufficient balance");
        }else{
            log.add("Withdrawing "+amount +" "+ ownerName);
            balance = balance - amount;
        }
    }

    public void printTransactionHistory(){
        for(String str: log){
            System.out.println(str);
        }
    }
}
