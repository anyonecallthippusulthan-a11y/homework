package banking;

public class banks {
    private double accountNumber;
    private String accounHolderName;
    private double balance;

    
    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccounHolderName() {
        return accounHolderName;
    }

    public void setAccounHolderName(String accounHolderName) {
        this.accounHolderName = accounHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("this is total number"+amount);
        }
        else
        {
            System.out.println("not valid");
        }
        }
    public void withdraw(double amount)
    {
        if((amount<=balance)&&(amount >0))
        {
            balance-=amount;
            System.out.println("this is total number"+amount);
        }
        else
        {
            System.out.println("not valid");
        }
        }
    void display()
    {
         System.out.println( "accountNumber"+accountNumber);
         System.out.println("accounHolderName"+accounHolderName);
         System.out.println("balance"+balance);
    }
    
        
        
    }
     
                  

