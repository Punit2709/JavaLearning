import java.lang.*;
import java.util.*;

class Account
{
    private String Accno;
    private String Name;
    private String Branch;
    protected long balance;

    public Account(String Accno, String Name, String Branch)
    {
        this.Accno = Accno;
        this.Branch = Branch;
        this.Name = Name;
        this.balance = 0;
    }

    public String getAccno(){return this.Accno;}
    public String getName(){return this.Name;}
    public String getBranch(){return this.Branch;}
    public long getBalance(){return this.balance;}

    public void setBalance(long balance)
    {
        this.balance = balance;
    }
}

class Saving extends Account
{
    public Saving(String Accno, String Name, String Branch) {
        super(Accno, Name, Branch);
        // TODO Auto-generated constructor stub
    }

    public void deposit(long amount)
    {
        this.balance += amount;
    }

    public void withdraw(long amount)
    {
        this.balance -= amount;
    }
}

class Loan extends Account
{
    public Loan(String Accno, String Name, String Branch) {
        super(Accno, Name, Branch);
        // TODO Auto-generated constructor stub
    }
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class CustomerAccount
{
    public static void main(String[] args)
    {
        Saving S1 = new Saving("111A", "PUNIT", "Ahmedabad");
        
        S1.deposit(15000);
        System.out.println("Amount after Deposit :- " + S1.getBalance());
        S1.withdraw(5000);
        System.out.println("Amount after Withdraw :- " + S1.getBalance());

        Loan L1 = new Loan("11A", "PUNIT", "Ahmedaabd");
        L1.payEMI(5000);
        System.out.println("Amount after Deposit :- " + L1.getBalance());

    }

}