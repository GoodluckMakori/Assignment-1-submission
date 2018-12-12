package Practicals;

public class Time {
    private int second=0;
    private int minute=0;
    private int hour=0;
    public Time(){

    }
    public Time(int second,int minute,int hour){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;  // No input validation
    }
    public void setMinute(int minute) {
        this.minute = minute;  // No input validation
    }
    public void setHour(int hour) {
        this.hour = hour;  // No input validation
    }
    public String toString() {

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
}

