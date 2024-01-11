package br.com.javamoon.concurrency.race_conditions;

import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

class RaceConditionsTest {

    @Test
    void testUnsincronyzedCounter() throws InterruptedException {
        Counter counter = new Counter();
        int incremment = 100;
    
        MyThread[] threads = new MyThread[1000];
        for (int i = 0; i < threads.length; ++i) {
            threads[i] = new MyThread(counter, incremment);
        }
    
        for (int i = 0; i < threads.length; ++i) {
            threads[i].start();
        }
    
        for (int i = 0; i < threads.length; ++i) {
            threads[i].join();
        }
    
        System.out.println(counter.getCount());
        assertNotEquals(incremment * threads.length, counter.getCount()); // may be equal, oh multithreading world :)
    }
}
