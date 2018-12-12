package Practicals;

public class Main
{
public static void main(String[] args) {
	// write your code here
        Account ac = new Account(572324567,0.0);
       ac.setBalance(200000);
        ac.credit(800000);
        ac.debit(600000);
       System.out.println(ac.toString());
    }
}
