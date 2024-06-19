package week8.day51;

class Trie {
    
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;
        
        TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }
    
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode crawler = root; 
        
        for (int i = 0; i < word.length(); i++) { 
            int index = word.charAt(i) - 'a'; 
            if (crawler.children[index] == null) {
                crawler.children[index] = new TrieNode();
            }
            crawler = crawler.children[index]; 
        }
        crawler.isEndOfWord = true; 
    }
    
    public boolean search(String word) {
        TrieNode crawler = root; 
        
        for (int i = 0; i < word.length(); i++) { 
            int index = word.charAt(i) - 'a'; 
            if (crawler.children[index] == null) {
                return false; 
            }
            crawler = crawler.children[index]; 
        }
        return (crawler != null && crawler.isEndOfWord); 
    }
    
    public boolean startsWith(String prefix) {
        TrieNode crawler = root;
        for (int i = 0; i < prefix.length(); i++) { 
            int index = prefix.charAt(i) - 'a'; 
            
            if (crawler.children[index] == null) {
                return false; 
            }
            crawler = crawler.children[index]; 
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println(trie.search("app"));     // returns true
    }
}
