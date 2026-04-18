// Program to add time (hours and minutes)

class Time2 {
    int hr, min;
    Time2(int hr, int min) {
        this.hr = hr;
        this.min = min;
    }
    Time2 add(Time2 t) {
        int min = this.min + t.min;
        int hr = this.hr + t.hr + min / 60;
        min = min % 60;
        return new Time2(hr, min);
    }
    void display() {
        System.out.println(hr + " hr " + min + " min");
    }
}
public class Time_add2{
    public static void main(String[] args) {
        Time2 t1 = new Time2(2, 40);
        Time2 t2 = new Time2(1, 30);
        Time2 t3 = t1.add(t2);
        t3.display();
    }
}