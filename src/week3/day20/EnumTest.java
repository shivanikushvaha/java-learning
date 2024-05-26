package week3.day20;

import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        Date from = Date.from(Instant.now());
        System.out.println(from);

        Integer i = Integer.valueOf("123");
        System.out.println(i);
    }
}
