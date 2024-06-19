package week8.day51;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> result;
    int m, n;

    static class TrieNode {
        boolean endOfWord;
        char ch;
        TrieNode[] children;

        TrieNode() {
            endOfWord = false;
            ch = ' ';
            children = new TrieNode[26];
        }
    }

    private TrieNode getNode() {
        return new TrieNode();
    }

    private void insert(TrieNode root, String word) {
        TrieNode pCrawl = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';

            if (pCrawl.children[idx] == null) {
                pCrawl.children[idx] = getNode();
                pCrawl.children[idx].ch = ch;
            }

            pCrawl = pCrawl.children[idx];
        }

        pCrawl.endOfWord = true;
    }

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private void findWords(char[][] board, int i, int j, TrieNode root, StringBuilder s) {
        if (i < 0 || i >= m || j < 0 || j >= n) return;

        char ch = board[i][j];
        int idx = ch - 'a';
        if (board[i][j] == '$' || root.children[idx] == null) return;

        root = root.children[idx];
        s.append(ch);
        if (root.endOfWord) {
            result.add(s.toString());
            root.endOfWord = false;
        }

        char temp = board[i][j];
        board[i][j] = '$';
        for (int[] dir : directions) {
            int new_i = i + dir[0];
            int new_j = j + dir[1];
            findWords(board, new_i, new_j, root, s);
        }
        board[i][j] = temp;
        s.deleteCharAt(s.length() - 1);
    }

    public List<String> findWords(char[][] board, String[] words) {
        result = new ArrayList<>();
        m = board.length;
        n = board[0].length;

        TrieNode root = getNode();
        for (String word : words) {
            insert(root, word);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = board[i][j];
                int idx = ch - 'a';
                if (root.children[idx] != null) {
                    findWords(board, i, j, root, new StringBuilder());
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
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
}
