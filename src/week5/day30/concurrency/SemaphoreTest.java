package week5.day30.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new IncrementCount("A", semaphore);
        new DecrementCount("B", semaphore);
    }
}

class Shared{
    static int count = 0;
}

class IncrementCount{
    String name;
    Semaphore semaphore;

    IncrementCount(String name, Semaphore semaphore){
        this.name = name;
        this.semaphore = semaphore;
        new Thread(r1).start();
    }
    Runnable r1 = () -> {
        try {
            System.out.println(name + " is waiting for permit");
            semaphore.acquire();
            System.out.println(name + " get a permit");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + " : " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " release a permit.");
        semaphore.release();
    };
}

class DecrementCount{
    String name;
    Semaphore semaphore;

    DecrementCount(String name, Semaphore semaphore){
        this.name = name;
        this.semaphore = semaphore;
        new Thread(r2).start();
    }
    Runnable r2 = () -> {
        try {
            System.out.println(name + " is waiting for permit");
            semaphore.acquire();
            System.out.println(name + " get a permit");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + " : " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };
}
