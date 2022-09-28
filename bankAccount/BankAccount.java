import java.util.*;
public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static int totalInAccount = 0;

    public BankAccount(){
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void depositChecking(double amount){
        this.checkingBalance += amount;
    }

    public double withdrawChecking(double amount){
        if (this.checkingBalance < amount){
            return this.checkingBalance;
        }else{
            this.checkingBalance -= amount;
        }
        return this.checkingBalance;
    }

    public void displayBalances(){
        System.out.println("Checking Balance: " + this.getCheckingBalance());
        System.out.println("Savings Balance: " + this.getSavingsBalance());
    }
}