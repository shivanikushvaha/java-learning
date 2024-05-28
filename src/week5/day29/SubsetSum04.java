package week5.day29;

public class SubsetSum04 {

    private static boolean isSubSet(int[] set, int n, int sum) {
        if (sum == 0) return true;

        if (n == 0) return false;

        if (set[n - 1] > sum) return isSubSet(set, n - 1, sum);

        return isSubSet(set, n - 1, sum - set[n - 1]) || isSubSet(set, n - 1, sum);
    }

    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;

        if (isSubSet(set, n, sum) == true)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }

}
