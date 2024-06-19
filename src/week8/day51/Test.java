package week8.day51;

public class Test {
    static int m, n, l;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String word = "pea";
        boolean exist = exist(board, word);
        System.out.println(exist);
    }

    private static boolean find(char[][] board, int i, int j, String word, int idx) {
        if (idx >= l)
            return true;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(idx))
            return false;

        char temp = board[i][j];
        board[i][j] = '$';

        for (int[] dir : directions) {
            int i_ = i + dir[0];
            int j_ = j + dir[1];
            if (find(board, i_, j_, word, idx + 1))
                return true;
        }
        board[i][j] = temp;
        return false;
    }

    private static boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        l = word.length();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
