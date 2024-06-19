package week7.day46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] diagonalOrder = findDiagonalOrder(mat);
        for (int i : diagonalOrder)
            System.out.print(i + " ");
    }

    private static int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n * m];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int d = i + j;
                if (!map.containsKey(d))
                    map.put(d, new ArrayList<>());

                map.get(d).add(mat[i][j]);
            }
        }

        int i = 0;
        int k = 0;
        for (Map.Entry<Integer, List<Integer>> ma : map.entrySet()) {
            if (k % 2 == 0) {
                List<Integer> reversed = ma.getValue().reversed();
                for (int l : reversed) {
                    arr[i++] = l;
                }
            }
            else {
                for (int l : ma.getValue()) {
                    arr[i++] = l;
                }
            }
            k++;
        }

        return arr;
    }
}
