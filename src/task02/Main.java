package task02;

public class Main {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(i);
        }
        long afterLoop = System.currentTimeMillis();

        System.out.println("Time spent in loop: " + (afterLoop - now) + "ms");
        //1st try: Time spent in loop: 2346ms
        //2nd try: Time spent in loop: 2347ms
        //3rd try: Time spent in loop: 2350ms

        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.start();
        //MyThreadOne - Time spent in loop: 1171ms
        //MyThreadOne - Time spent in loop: 1254ms
        //MyThreadOne - Time spent in loop: 1276ms
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.start();
        //MyThreadTwo - Time spent in loop: 1178ms
        //MyThreadTwo - Time spent in loop: 1381ms
        //MyThreadTwo - Time spent in loop: 1186ms
    }
}
