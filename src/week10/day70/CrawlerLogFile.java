package week10.day70;

import java.util.HashMap;
import java.util.Map;

public class CrawlerLogFile {
    public static void main(String[] args) {
        String[] logs = {"d1/", "../", "../", "../"};
        int i = minOperations(logs);
        System.out.println(i);
    }

    public static int minOperations(String[] logs) {
        int n = logs.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (logs[i].equals("../")) {
                if (count == 0)
                    count = 0;
                else
                    count--;
            } else if (logs[i].equals("./")) {
                count += 0;
            } else {
                count++;
            }
        }
        return count;
    }
}
