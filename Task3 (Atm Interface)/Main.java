import java.util.Scanner;

 public class Main{

    public static void main(String[] args){

    AtmInterface ai= new Implement();

    Scanner sc = new Scanner(System.in);
    System.out.println("----------------------------------");
    System.out.println(" !! WELCOME TO ATM MACHINE !! ");
    System.out.println("----------------------------------");

    System.out.println("Enter your user ID : ");
    int id= sc.nextInt();
 
    System.out.println("Enter your user Pin : ");
    int pin= sc.nextInt();

    System.out.println();

    if(check_id_pin(id,pin))
    {  
        while(true)
        {
        System.out.println("-------------------------------------");
        System.out.println("Enter 1 , for View Available Balance");
        System.out.println("Enter 2 , for Withdraw");
        System.out.println("Enter 3 , for Deposit");
        System.out.println("Enter 4 , for Transfer money");
        System.out.println("Enter 5 , for Transaction History");
        System.out.println("enter 6 , for Quit");
        System.out.println("-------------------------------------");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
            ai.viewBalance(); 
            break;

            case 2:
                System.out.println("Enter Amount To Withdraw");
                double withdrawAmount = sc.nextDouble();
                ai.withdraw(withdrawAmount);
                
            break;

            case 3:
                System.out.println("Enter Amount To Deposit");
                double depositAmount = sc.nextDouble();
                ai.deposit(depositAmount);
                
            break;

            case 4:
                System.out.println("Enter Transaction ID");
                int tranID=sc.nextInt();
                if(tranID==5678)
                {
                    System.out.println("Enter Amount To Transfer");
                    double transferAmount = sc.nextDouble();
                    ai.transfer(transferAmount);
                    System.out.println("SUCCESSFULLY TRANSFERED AMOUNT TO "+ tranID);
                    ai.viewBalance();
                }
                else 
                {
                    System.out.println("Invalid Transasction ID..");
                }
            break;

            case 5:
            ai.transactionHistory();
            break;

            case 6:
                System.out.println("COLLECT YOUR ATM CARD\n THANK YOU FOR USING ATM MACHINE .");
                System.exit(0);
            break;
               
        }
        }
    }
    else
    {
    System.out.println("INVALID USERID OR PIN");
    }

    }


    public static boolean check_id_pin(int id,int pin)
    {
        if(id==12345 && pin==54321)
        {
        return true;
        }
        else
        {
        return false;
        }
    }

      
}