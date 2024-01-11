package br.com.javamoon.concurrency.counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.start();

        for (int i = 0; i < 10; ++i) {
            System.out.printf("main: %s\n", i);
            Thread.sleep(100);
        }        
    }
}
