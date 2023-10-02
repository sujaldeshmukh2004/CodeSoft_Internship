class AtmEntity
{

    private double balance;

    private double withdrawAmount;

    private double depositAmount;

    public AtmEntity()
    {
        // constructor
    }

    public void setBalance(double balance){
        this.balance=balance;
    }


    public  double getBalance(){
        return balance;
    }

    public void setWithdrawAmount(double withdrawAmount){
           this.withdrawAmount=withdrawAmount;
    }

    public  double getWithdrawAmount(){
        return withdrawAmount;
    }

    public void setDepositAmount(double depositAmount){
           this.depositAmount=depositAmount;
    }

    public  double getDepositAmount(){
        return depositAmount;
    }
 
}