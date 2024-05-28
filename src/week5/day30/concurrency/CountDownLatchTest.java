package week5.day30.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("Task completed by thread " + Thread.currentThread().threadId());
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
            System.out.println("all task completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
