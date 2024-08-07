package week14.day92;

import java.util.ArrayList;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] nums = {16,17,4,3,5,2};
        ArrayList<Integer> leaders = leaders(6, nums);
        System.out.println(leaders);
    }

    public static ArrayList<Integer> leaders(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean add = true;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    add = false;
                    break;
                }
            }
            if (add)
                list.add(arr[i]);
            add = true;
        }
        list.add(arr[n - 1]);
        return list;
    }
}
