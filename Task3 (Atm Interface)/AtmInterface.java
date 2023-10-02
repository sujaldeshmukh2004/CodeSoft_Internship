public interface AtmInterface{

    public void withdraw(double withdrawAmount);
  
    public void deposit(double depositAmount);
  
    public void transactionHistory();
  
    public void transfer(double transferAmount);  
  
    public void viewBalance();
  }