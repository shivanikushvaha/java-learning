package week7.day46;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMatrixDiagonally {
    public static void main(String[] args) {
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] mat1 = diagonalSort(mat);

        for (int[] arr : mat1) {
            for (int a : arr)
                System.out.print(a + "\t");
            System.out.println();
        }
    }

    private static int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int d = i + j;
                if (!map.containsKey(d))
                    map.put(d, new ArrayList<>());
                map.get(d).add(mat[i][j]);
            }
        }
        for (Map.Entry<Integer, List<Integer>> ma : map.entrySet()) {
            ma.getValue().sort(Comparator.naturalOrder());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int d = i + j;
                mat[i][j] = map.get(d).removeFirst();
            }
        }

        return mat;
    }
}
