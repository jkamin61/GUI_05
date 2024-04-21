package task03;

class AddingThread extends Thread {

    private Counter c;

    public AddingThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (c) {
                c.inc(i);
            }

        }
    }
}
