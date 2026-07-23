class TrieNode {

    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

public class TrieImplementation {

    private TrieNode root;

    public TrieImplementation() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    public boolean search(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return current.isEndOfWord;
    }

    public boolean startsWith(String prefix) {

        TrieNode current = root;

        for (char ch : prefix.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return true;
    }

    public static void main(String[] args) {

        TrieImplementation trie = new TrieImplementation();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");

        System.out.println("Search apple: " + trie.search("apple"));
        System.out.println("Search appl: " + trie.search("appl"));
        System.out.println("StartsWith app: " + trie.startsWith("app"));
        System.out.println("StartsWith bat: " + trie.startsWith("bat"));
    }
}