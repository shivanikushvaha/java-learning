package week9.day63.contest404;

class Solution {

    public int maxHeightOfTriangle(int red, int blue) {
        for (int i = 1, k[] = new int[2]; ; i++) {
            k[i % 2] += i;
            if ((k[0] > red || k[1] > blue) && (k[1] > red || k[0] > blue)) {
                return i - 1;
            }
        }
    }
}