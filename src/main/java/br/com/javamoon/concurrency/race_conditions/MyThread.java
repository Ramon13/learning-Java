package br.com.javamoon.concurrency.race_conditions;

class MyThread extends Thread {

    private Counter counter;
    private int incremmentTimes = 0;

    public MyThread(Counter counter, int incremmentTimes) {
        this.counter = counter;
        this.incremmentTimes = incremmentTimes;
    }

    @Override
    public void run() {
        for (int i = 0; i < incremmentTimes; ++i) {
            counter.incremment();
        }
    }
}