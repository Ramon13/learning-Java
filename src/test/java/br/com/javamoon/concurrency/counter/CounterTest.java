package br.com.javamoon.concurrency.counter;

import org.junit.jupiter.api.Test;

class CounterTest {
    
    @Test
    void sleepThreadsTest() throws InterruptedException {
        Counter counter = new Counter();
        counter.start();

        for (int i = 0; i < 10; ++i) {
            System.out.printf("main: %s\n", i);
            Thread.sleep(100);
        }
    }
}
