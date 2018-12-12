package Practicals;

public class Account
{
        private int accountNumber;
        private double balance=0.0;

        public Account(int accountNumber, double balance){
            this.accountNumber = accountNumber;
            this.balance = balance;

        }
        public Account(int accountNumber){
            this.accountNumber = accountNumber;
        }

        public int getAccountNumber() {
            return accountNumber;
        }
        public double getBalance(){
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public void credit(double amount){
            this.balance=amount + balance;
        }
        public void debit(double amount){
            if(balance>=amount) {
                balance = balance - amount;
                System.out.println("You have withdrawn " + amount+" Your new balance is " + balance);
            }
            else
                System.out.println("amount withdrawn exceeds the current balance!");
        }

        @Override
        public String toString()
        {
            return super.toString() + "A/C no."+ accountNumber + ",Balance "+ balance;
        }
}
