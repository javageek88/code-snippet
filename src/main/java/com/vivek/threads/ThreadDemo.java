package com.vivek.threads;

public class ThreadDemo {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        Thread t1 = new Thread(counterThread, "Thread1");
        Thread t2 = new Thread(counterThread, "Thread2");
        t1.start();
        t2.start();
    }
}

class Counter{

    int n;

    public void get() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()  + " : "+ n);
    }

    public void put(int n) throws InterruptedException {
        Thread.sleep(1000);
        this.n = n;
    }

}

class CounterThread implements Runnable{

    @Override
    public void run() {
        Counter counter = new Counter();
        int i =0;
        while (true){
            try {
                counter.put(i);
                counter.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
