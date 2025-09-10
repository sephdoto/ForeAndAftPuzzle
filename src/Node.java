//Better modelled as neighbours instead of left or right children. As undirected graph
public class Node {
    private int piece;  //1 for Green and 2 for Red 0 for empty
    private Node neighbours[];
    private String name;

    public Node(int piece, String name) {
        this.piece = piece;
        this.name = name;
    }

    public Node(String name) {
        this.name = name;
    }

    public Node(int piece, Node[] neighbours) {
        this.piece = piece;
        this.neighbours = neighbours;
    }

    public int getValue() {
        return piece;
    }

    public void setValue(int piece) {
        this.piece = piece;
    }

    public Node[] getNeighbours() {
        return neighbours;
    }

     public void setNeighbours(Node... neighbours) {
        this.neighbours = neighbours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return piece == 0;
    }
}