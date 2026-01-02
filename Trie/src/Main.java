//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("ab");
        trie.insert("acv");

        Node node1= trie.getLastNode("ab");
        System.out.println(trie.getWord(node1));

        System.out.println(trie.search("ab"));
        System.out.println(trie.search("acs"));
    }
}