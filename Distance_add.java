// Program to add two distances (m, cm, mm)
class Distance {
    int m, cm, mm;
    // constructor
    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }
    // method to add two distances
    Distance add(Distance d2) {
        int mm = this.mm + d2.mm;
        int cm = this.cm + d2.cm + mm / 10;  // convert mm to cm
        mm = mm % 10;
        int m = this.m + d2.m + cm / 100;    // convert cm to m
        cm = cm % 100;
        return new Distance(m, cm, mm);
    }
    // display method
    void display() {
        System.out.println(m + " m " + cm + " cm " + mm + " mm");
    }
}
public class Distance_add {
    public static void main(String[] args) {
        // creating objects
        Distance d1 = new Distance(2, 75, 8);
        Distance d2 = new Distance(3, 40, 6);
        Distance result = d1.add(d2);
        System.out.print("Result = ");
        result.display();
    }
}