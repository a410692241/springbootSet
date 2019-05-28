package com.wei.async;

import org.springframework.scheduling.annotation.Async;

public class Jeep implements Runnable {

    @Async
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().toString());
            System.out.println(i);
        }
    }
}
