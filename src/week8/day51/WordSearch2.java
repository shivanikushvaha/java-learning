package week8.day51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearch2 {
    static int m, n;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> words1 = findWords(board, words);
        System.out.println(words1);
    }

    private static boolean find(char[][] board, int i, int j, String word, int idx, int l) {
        if (idx >= l)
            return true;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(idx))
            return false;

        char temp = board[i][j];
        board[i][j] = '$';

        for (int[] dir : directions) {
            int i_ = i + dir[0];
            int j_ = j + dir[1];
            if (find(board, i_, j_, word, idx + 1, l))
                return true;
        }
        board[i][j] = temp;
        return false;
    }

    private static List<String> findWords(char[][] board, String[] words) {
        m = board.length;
        n = board[0].length;
        List<String> list = new ArrayList<>();
        char[][] finalBoard = board;
        char[][] board2 = Arrays.stream(board).map(e -> e.clone()).toArray($ -> finalBoard.clone());

        for (int k = 0; k < words.length; k++) {
            int l = words[k].length();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == words[k].charAt(0) && find(board, i, j, words[k], 0, l)) {
                        list.add(words[k]);
                    }
                }
            }
            board = board2;
        }

        return list;
    }
}
