package week5.day30.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
            System.out.println("Barrier reachded!");
        });
        System.out.println("Starting...");
        new MyThread("A", cyclicBarrier);
        new MyThread("B", cyclicBarrier);
        new MyThread("C", cyclicBarrier);
    }
}

class MyThread{
    String name;
    CyclicBarrier cyclicBarrier;

    MyThread(String name, CyclicBarrier cyclicBarrier){
        this.name = name;
        this.cyclicBarrier = cyclicBarrier;
        new Thread(r).start();
    }

    Runnable r = () -> {
        System.out.println(name);
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    };
}
