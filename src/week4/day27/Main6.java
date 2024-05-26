package week4.day27;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        Main6 main6 = new Main6();
        double medianSortedArrays = main6.findMedianSortedArrays(new int[]{}, new int[]{1});
        System.out.println(medianSortedArrays);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int totalLength = nums1.length + nums2.length;
        int[] mergeArr = new int[totalLength];

        int k = 0;

        for (int i = 0; i < nums1.length; i++)
                mergeArr[k++] = nums1[i];

        for (int i = 0; i < nums2.length; i++)
            mergeArr[k++] = nums2[i];

        Arrays.sort(mergeArr);

        if (totalLength % 2 != 0)
            return mergeArr[totalLength / 2];
        else
            return (double) (mergeArr[(totalLength / 2 ) - 1] + mergeArr[totalLength / 2]) / 2;
    }

}
