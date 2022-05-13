package chapterThree;

public class Account {
    private String accountName;
    private double balance;
    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;

    }


    public void deposit (double depositAmount){
        if(depositAmount >0.0){
            balance = balance + depositAmount;
        }
    }

    public String withdraw(int withdrawal){
        if(withdrawal > balance){
            System.out.println("The You dont Have enough in your balance");
            return ("The You dont Have enough in your balance");
        }

        else {
            balance = balance - withdrawal;
        }
        return ("Transaction Complete, Have a good day " + accountName);
    }
}
