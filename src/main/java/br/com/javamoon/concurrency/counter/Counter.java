package br.com.javamoon.concurrency.counter;

class Counter extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; ++i) {
                System.out.printf("counter: %s\n", i);
                Thread.sleep(100);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
