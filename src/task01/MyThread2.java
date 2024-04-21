package task01;

public class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.err.print(i);
        }
    }
}
