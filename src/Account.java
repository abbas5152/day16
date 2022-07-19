public class Account {
    String accountNumber;
    double Balance;
    public  Account(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public void Deposit(int amount) {
      Balance=Balance+amount;
        System.out.println(amount +" Deposited successfully");
    }
    public  double withdraw(int amount) throws InsufficientFundsException {
        Balance= Balance-amount;
        if(Balance<0){
           InsufficientFundsException ic= new InsufficientFundsException("balance is lower");
            throw ic;
        }
        else{
            System.out.println(Balance+" remained balance");
            return Balance;
        }
    }
}
