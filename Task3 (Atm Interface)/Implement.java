import java.util.HashMap;
import java.util.Map;

class Implement implements AtmInterface{
       
   AtmEntity atm = new AtmEntity();

   Map<Double,String> statement=new HashMap<>();


 @Override
  public void withdraw(double withdrawAmount)
  {
      if(withdrawAmount % 500 == 0)
      {
         if(withdrawAmount<atm.getBalance())
         {
            statement.put(withdrawAmount,"Amount Withdrawn");

            System.out.println("Collect your Case "+withdrawAmount);
            double totalAmount=atm.getBalance()-withdrawAmount;
            atm.setBalance(totalAmount);
            viewBalance();
         }
         else 
         {
            System.out.println("Insufficient Balance !!");
         }
      }
      else{
         System.out.println("Please Enter the amount in multiple of 500");
      }
  }

  @Override
  public void deposit(double depositAmount)
  {
      statement.put(depositAmount,"Amount Deposited");

      System.out.println(depositAmount+" , Deposited Successfully!!");
      double totalAmount=atm.getBalance()+depositAmount;
      atm.setBalance(totalAmount);
      viewBalance();
   }

  @Override
  public void transactionHistory()
  {
      for(Map.Entry<Double,String> m:statement.entrySet())
      {
         System.out.println(m.getKey()+" : "+m.getValue());
      }
  }

  @Override
  public void transfer(double transferAmount)
  {
      if(transferAmount<atm.getBalance())
      {
         statement.put(transferAmount,"Amount Transfered");
         double totalAmount=atm.getBalance()-transferAmount;
         atm.setBalance(totalAmount);
      }
      else 
      {
         System.out.println("Insufficient Balance !!");
      }
  }

  @Override
  public void viewBalance()
  {
     System.out.println("Available Balance is : "+atm.getBalance());
  }

}