package task02;

public class MyThreadTwo extends Thread{
    public void run() {
        long now = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        long afterLoop = System.currentTimeMillis();

        System.out.println("MyThreadTwo - Time spent in loop: " + (afterLoop - now) + "ms");
    }
}
