package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        myThread.getState();


        Thread myThead2 = new Thread(new RunnableThread());
        myThead2.start();
    }
}
