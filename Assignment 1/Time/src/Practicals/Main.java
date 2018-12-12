package Practicals;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(1, 2, 3);
        System.out.println(time);
        Time t2 = new Time();
        System.out.println(t2);

        time.setHour(7);
        time.setMinute(8);
        time.setSecond(9);
        System.out.println(time);
        System.out.println(time.getHour()+":" + time.getMinute()+":" + time.getSecond());

        time.setTime(58, 59, 23);
        System.out.println(time);

        System.out.println(time.nextSecond());
        System.out.println(time.nextSecond().nextSecond().nextSecond());
    }
}