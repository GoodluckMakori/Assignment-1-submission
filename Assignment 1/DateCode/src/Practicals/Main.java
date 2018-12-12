package Practicals;


public class Main{

    public static void main (String[] args) {
	// write your code here
        Date date = new Date(1990, 4, 7);
        System.out.println(date);

        date.setYear(1979);
        date.setMonth(9);
        date.setDay(25);
        System.out.println(date);
        System.out.println( date.getMonth() +"/"+date.getDay()+"/"+ date.getYear());

        date.setDay(5);
        System.out.println(date);


    }
}
