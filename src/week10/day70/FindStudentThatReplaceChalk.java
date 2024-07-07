package week10.day70;

public class FindStudentThatReplaceChalk {
    public static void main(String[] args) {
        int[] chalk = {5, 1, 5};
        int k = 22;
        int i = chalkReplacer(chalk, k);
        System.out.println(i);
    }

    public static int chalkReplacer(int[] chalk, int k) {
        int i = 0;
        int n = chalk.length;
        int idx = 0;
        while (k >= 0) {
            idx = i % n;
            i++;
            k = k - chalk[idx];
        }
        return idx;
    }
}
