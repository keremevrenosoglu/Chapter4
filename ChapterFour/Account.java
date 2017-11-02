
//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
 
  
  private double balance;
  private String name;
  private long acctNum;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
   this.balance = initBal;
   this.name = owner;
   this.acctNum = number;
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
      }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
 
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
      return this.balance;
 
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
   return "Your account information is: " + this.name + this.acctNum + this.balance;  
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee()
  {
   for (int i=10; i>0; i--) {
       balance --;
       
   
  }
  
}
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public void changeName(String newName)
                         
  {
      System.out.println("Type new account name");
      
  }
}