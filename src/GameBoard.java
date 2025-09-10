public class GameBoard {
    Node one;
    Node two;
    Node three;
    Node four;
    Node five;
    Node six;
    Node seven;
    Node eight;
    Node nine;
    Node ten;
    Node eleven;
    Node twelve;
    Node thirteen;
    Node fourteen;
    Node fifteen;
    Node sixteen;
    Node seventeen;

    public GameBoard() {
        createBoard();
    }

    public void createBoard() {
        initNodes();
        setNeighbours();
    }

    private void initNodes() {
        one = new Node(1, "one");
        two = new Node(1, "two");
        three = new Node(1, "three");
        four = new Node(1, "four");
        five = new Node(1, "five");
        six = new Node(1, "six");
        seven = new Node(1, "seven");
        eight = new Node(1, "eight");
        nine = new Node(0, "nine");
        ten = new Node(2, "ten");
        eleven = new Node(2, "eleven");
        twelve = new Node(2, "twelve");
        thirteen = new Node(2, "thirteen");
        fourteen = new Node(2, "fourteen");
        fifteen = new Node(2, "fifteen");
        sixteen = new Node(2, "sixteen");
        seventeen = new Node(2, "seventeen");
    }

    private void printNode(Node node) {
        System.out.print(node.getName() + "(" + node.getValue() + "): ");
        for (Node neighbor : node.getNeighbours()) {
            System.out.print(neighbor.getName() + "(" + neighbor.getValue() + ") ");
        }
        System.out.println();
    }

    private void setNeighbours() {
        this.one.setNeighbours(two, three);
        this.two.setNeighbours(four, five, one);
        this.three.setNeighbours(one, five, six);
        this.four.setNeighbours(two, seven);
        this.five.setNeighbours(two, seven, eight, three);
        this.six.setNeighbours(three, eight);
        this.seven.setNeighbours(four, five, nine);
        this.eight.setNeighbours(five, six, nine);
        this.nine.setNeighbours(seven, eight, ten, eleven);
        this.ten.setNeighbours(nine, thirteen, twelve);
        this.eleven.setNeighbours(nine, fourteen, thirteen);
        this.twelve.setNeighbours(ten, fifteen);
        this.thirteen.setNeighbours(ten, eleven, sixteen, fifteen);
        this.fourteen.setNeighbours(eleven, seventeen);
        this.fifteen.setNeighbours(twelve, thirteen, seventeen);
        this.sixteen.setNeighbours(thirteen, fourteen, seventeen);
        this.seventeen.setNeighbours(fifteen, sixteen);
    }
}
