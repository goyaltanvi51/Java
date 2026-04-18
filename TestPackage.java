
import mypack.*;   // import all classes
public class TestPackage {
    public static void main(String[] args) {
        // creating objects
        Add a = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();
        Msg msg = new Msg();
        // calling methods
        a.show();
        s.show();
        m.show();
        d.show();
        msg.show();
    }
}