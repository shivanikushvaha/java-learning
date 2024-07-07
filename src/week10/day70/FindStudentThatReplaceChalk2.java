package week10.day70;

public class FindStudentThatReplaceChalk2 {
    public static void main(String[] args) {
        int[] chalk = {3, 4, 1, 2};
        int k = 25;
        int i = chalkReplacer(chalk, k);
        System.out.println(i);
    }

    public static int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;

        long     sum = 0;
        for (int s : chalk) {
            sum += s;
        }
        long m = k % sum;

        int i = 0;
        int idx = 0;
        while (m >= 0) {
            idx = i % n;
            i++;
            m = m - chalk[idx];
        }
        return idx;
    }
}
