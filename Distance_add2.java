// Program to add two distances (m, cm only)

class Distance2 {
    int m, cm;
    // constructor
    Distance2(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }
    // method to add two distances
    Distance2 add(Distance2 d2) {
        int cm = this.cm + d2.cm;
        int m = this.m + d2.m + cm / 100;  // convert cm → m
        cm = cm % 100;
        return new Distance2(m, cm);
    }
    // display method
    void display() {
        System.out.println(m + " m " + cm + " cm");
    }
}
public class Distance_add2 {
    public static void main(String[] args) {
        // creating objects
        Distance2 d1 = new Distance2(2, 80);
        Distance2 d2 = new Distance2(3, 50);
        Distance2 result = d1.add(d2);
        System.out.print("Result = ");
        result.display();
    }
}