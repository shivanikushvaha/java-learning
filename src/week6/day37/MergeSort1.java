package week6.day37;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 3, 2};
        
        divide(arr, 0, arr.length - 1);

        for (int a : arr)
            System.out.println(a);
    }

    private static void divide(int[] arr, int si, int ei) {
        if (si >= ei)
            return;

        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei){
            if (arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid)
            merged[x++] = arr[idx1++];

        while (idx2 <= mid)
            merged[x++] = arr[idx2++];

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }
}
