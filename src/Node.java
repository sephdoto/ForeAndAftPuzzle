//Better modelled as neighbours instead of left or right children. As undirected graph
public class Node {
    private int piece;  //1 for Green and 2 for Red 0 for empty
    private Node neighbours[];
    private String name;
    private Node topLeft;
    private Node topRight;
    private Node bottomLeft;
    private Node bottomRight;

    public Node getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Node topLeft) {
        this.topLeft = topLeft;
    }

    public Node getTopRight() {
        return topRight;
    }

    public void setTopRight(Node topRight) {
        this.topRight = topRight;
    }

    public Node getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Node bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Node getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Node bottomRight) {
        this.bottomRight = bottomRight;
    }

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