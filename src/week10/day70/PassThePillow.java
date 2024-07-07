package week10.day70;

public class PassThePillow {
    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        int i = passThePillow(n, time);
        System.out.println(i);
    }

    public static int passThePillow(int n, int time) {
        int idx = 1;
        boolean forward = true;
        for (int i = 1; i <= time; i++) {
            if (forward) {
                idx++;
                if (idx == n) {
                    forward = false;
                }
            }
            else {
                idx--;
                if (idx == 1)
                    forward = true;
            }
        }
        return idx;
    }
}
