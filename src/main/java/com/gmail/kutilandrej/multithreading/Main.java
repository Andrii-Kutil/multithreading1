package com.gmail.kutilandrej.multithreading;

import com.gmail.kutilandrej.multithreading.thread.MyThread1;
import com.gmail.kutilandrej.multithreading.thread.MyThread2;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    MyThread1 thread1 = new MyThread1();

    MyThread2 runnable = new MyThread2();
    Thread thread2 = new Thread(runnable);

    thread1.start();
    thread2.start();
//    new Thread((() -> {
//      for (int i = 0; i < 1000; i++) {
//        System.out.println("three");
//      }
//    })).start();
    Thread.sleep(3000);
    thread1.setRun(false);
    runnable.setRun(false);

  }
}
