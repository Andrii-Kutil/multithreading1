package com.gmail.kutilandrej.multithreading.thread;

public class MyThread2 implements Runnable {

  volatile private boolean isRun = true;

  public void setRun(boolean run) {
    isRun = run;
  }

  @Override
  public void run() {
    for (int i = 0; isRun; i++) {
      System.out.println("second");
    }
  }
}