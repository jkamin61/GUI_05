package task03;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        AddingThread at0 = new AddingThread(c);
        at0.start();
        AddingThread at1 = new AddingThread(c);
        at1.start();
        AddingThread at2 = new AddingThread(c);
        at2.start();

        while (at0.isAlive() || at1.isAlive() || at2.isAlive()) ;

        System.out.println("Counter.x=" + c);
    }
}

