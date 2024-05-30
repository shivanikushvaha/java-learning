package week5.day30.concurrency;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

    public static final Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            exchangeData("Thread 1: Sending data", "Data from thread 1");
        });

        Thread thread2 = new Thread(() -> {
            exchangeData("Thread 2 : Sending data", "Data from thread 2");
        });

        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exchangeData(String message, String dataToSend){
        try {
            System.out.println(message + " " + dataToSend);
            String receiveData = exchanger.exchange(dataToSend);
            System.out.println(message + " : Received - " + receiveData);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
