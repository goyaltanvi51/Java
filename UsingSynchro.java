// Program to print 1–100 using threads in sequence
// using synchronization
class Syncro extends Thread {
    String name;  // to identify thread
    Syncro(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println("Starting " + name);
        // print numbers
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nEnding " + name);
    }
}
public class UsingSynchro {
    public static void main(String[] args) {
        // creating 3 threads
        Syncro t1 = new Syncro("Thread 1");
        Syncro t2 = new Syncro("Thread 2");
        Syncro t3 = new Syncro("Thread 3");
        try {
            // start first thread
            t1.start();
            t1.join();   // wait for t1 to finish
            // start second thread
            t2.start();
            t2.join();   // wait for t2
            // start third thread
            t3.start();
            t3.join();   // wait for t3
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}