// main class to test package and subpackage
import mypack.*;               // import main package
import mypack.subpack.*;       // import subpackage
public class TestSubPackage {
    public static void main(String[] args) {
        Add a = new Add();         // from main package
        Message m = new Message(); // from subpackage
        a.show();
        m.show();
    }
}