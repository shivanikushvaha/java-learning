package week8.day51;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> result = solution.findWords(board, words);
        System.out.println(result); // Output: [oath, eat]
    }

    List<String> result;
    int r, c;
    int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    static class TrieNode {
        boolean endOfWord;
        TrieNode[] children;
        String word;

        TrieNode() {
            endOfWord = false;
            children = new TrieNode[26];
            word = "";
        }
    }

    private TrieNode getNode() {
        return new TrieNode();
    }

    private void insert(TrieNode root, String str) {
        TrieNode pCrawl = root;
        for (char ch : str.toCharArray()) {
            if (pCrawl.children[ch - 'a'] == null) {
                pCrawl.children[ch - 'a'] = getNode();
            }
            pCrawl = pCrawl.children[ch - 'a'];
        }
        pCrawl.endOfWord = true;
        pCrawl.word = str;
    }

    private void DFS(char[][] board, int i, int j, TrieNode root) {
        if (i < 0 || i >= r || j < 0 || j >= c || board[i][j] == '$' || root.children[board[i][j] - 'a'] == null) {
            return;
        }
        root = root.children[board[i][j] - 'a'];
        if (root.endOfWord) {
            result.add(root.word);
            root.endOfWord = false;
        }
        char temp = board[i][j];
        board[i][j] = '$';
        for (int[] direction : directions) {
            int new_i = i + direction[0];
            int new_j = j + direction[1];
            DFS(board, new_i, new_j, root);
        }
        board[i][j] = temp;
    }

    public List<String> findWords(char[][] board, String[] words) {
        result = new ArrayList<>();
        r = board.length;
        c = board[0].length;

        TrieNode root = getNode();
        for (String str : words) {
            insert(root, str);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                char ch = board[i][j];
                if (root.children[ch - 'a'] != null) {
                    DFS(board, i, j, root);
                }
            }
        }
        return result;
    }

}
