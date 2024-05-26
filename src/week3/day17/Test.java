package week3.day17;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        long maxValue = Long.MAX_VALUE;
        System.out.println((int) maxValue);
        System.out.println(Long.valueOf(maxValue).intValue());

        long minValue = Long.MIN_VALUE;
        System.out.println((int) minValue);

        int i = Math.floorDiv(-222, 14);
        System.out.println(i);

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = x * y;
        System.out.println(z);
        long i1 = Math.multiplyFull(x, y);
        System.out.println(i1);

        NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String format = compactNumberInstance.format(1000);
        System.out.println(format);

        float fma = Math.fma(1, 2, 3);
        System.out.println(fma);
    }
}
