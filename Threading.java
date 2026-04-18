// Program to print 1–100 three times
// using without thread, Thread class, Runnable interfaces
// CLASS WITHOUT THREAD
class WithoutThread {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class Threading {
    public static void main(String[] args) {
        System.out.println("WITHOUT THREAD");
        WithoutThread obj = new WithoutThread();
        obj.printNumbers();
        obj.printNumbers();
        obj.printNumbers();
        System.out.println("\nUSING THREAD");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("\nUSING RUNNABLE");
        Thread r1 = new Thread(new MyRunnable());
        Thread r2 = new Thread(new MyRunnable());
        Thread r3 = new Thread(new MyRunnable());
        r1.start();
        r2.start();
        r3.start();
    }
}