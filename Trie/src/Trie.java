public class Trie {

    private Node root;

    public Trie() {
        root = new Node('\0', null);
    }

    public void insert(String word) {
        word = word.toLowerCase();

        Node current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException(
                        "Only lowercase English letters are allowed");
            }

            int index = c - 'a';

            if (current.child[index] == null) {
                current.child[index] = new Node(c, current);
            }

            current = current.child[index];
        }

        current.valid = true;
    }

    public boolean search(String word) {
        word = word.toLowerCase();

        Node current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c < 'a' || c > 'z') {
                return false;
            }

            int index = c - 'a';

            if (current.child[index] == null) {
                return false;
            }

            current = current.child[index];
        }

        return current.valid;
    }

    public String getWord(Node node) {
        StringBuilder sb = new StringBuilder();

        while (node != null && node.parent != null) {
            sb.append(node.c);
            node = node.parent;
        }

        return sb.reverse().toString();
    }

    public Node getLastNode(String word) {
        word = word.toLowerCase();

        Node current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c < 'a' || c > 'z') {
                return null;
            }

            int index = c - 'a';

            if (current.child[index] == null) {
                return null;
            }

            current = current.child[index];
        }

        return current;
    }
}
