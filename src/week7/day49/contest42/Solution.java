package week7.day49.contest42;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {12, 12, 30, 24, 24};
        int k = 24;
        long l = countPairs(nums, k);
        System.out.println(l);
    }

    private static int countPairs(int[] nums, int k) {
        // Create a HashMap to count the occurrences of numbers
        Map<Integer, Integer> counter = new HashMap<>();
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            //BigInteger.valueOf(k).gcd(BigInteger.valueOf(nums[i]))
            int gcdResult = BigInteger.valueOf(k).gcd(BigInteger.valueOf(nums[i])).intValue(); // Calculate the GCD of 'k' and 'nums[i]'
            int desiredFactor = k / gcdResult; // Calculate the desired factor to form a pair with 'nums[i]'

            for (int num : counter.keySet()) {
                if (num % desiredFactor == 0) {
                    // If 'num' is divisible by the desired factor, it can form pairs with 'nums[i]'
                    // Add the frequency of 'num' to the answer
                    ans += counter.get(num);
                }
            }

            // Increase the count of 'gcdResult' in the HashMap
            counter.put(gcdResult, counter.getOrDefault(gcdResult, 0) + 1);
        }

        return ans;
    }
}