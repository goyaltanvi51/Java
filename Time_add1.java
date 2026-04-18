// Program to add time (hours, minutes, seconds)
class Time {
    int hr, min, sec;
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    Time add(Time t) {
        int sec = this.sec + t.sec;
        int min = this.min + t.min + sec / 60;
        sec = sec % 60;
        int hr = this.hr + t.hr + min / 60;
        min = min % 60;
        return new Time(hr, min, sec);
    }
    void display() {
        System.out.println("Time = " + hr +"hours"+ ":" + min + "minutes" +":" + sec+"seconds");
    }
}
public class Time_add1 {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);
        Time t3 = t1.add(t2);
        t3.display();
    }
}