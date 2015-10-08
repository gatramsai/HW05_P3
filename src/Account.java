import java.util.Date;

/**
 * Created by sai on 10/6/2015.
 */
public class Account {
    private int Id;
    private double balance;
    static private double annualInterestRate;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        Id = id;
        this.balance = balance;
    }

    public int getId() {
        return Id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        Id = id;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonthlyInterest() {
        return (balance*(annualInterestRate/1200));
    }

    public void withdraw(double amount){
        balance = balance-amount;
    }
    public void deposit(double amount){
        balance = balance+amount;
    }


}
