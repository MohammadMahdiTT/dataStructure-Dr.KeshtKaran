public class Node {
    Node[] child = new Node[256];
    boolean valid;
    Node parent;
    char c;

    public Node(char c , Node parent)
    {
        this.c = c;
        this.parent = parent;
        this.valid = false;
    }
}
