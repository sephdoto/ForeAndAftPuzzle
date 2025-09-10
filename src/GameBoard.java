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
        this.one.setBottomLeft(two);
        this.one.setBottomRight(three);

        this.two.setNeighbours(four, five, one);
        this.two.setBottomLeft(four);
        this.two.setBottomRight(five);
        this.two.setTopRight(one);

        this.three.setNeighbours(one, five, six);
        this.three.setBottomLeft(five);
        this.three.setBottomRight(six);
        this.three.setTopLeft(one);

        this.four.setNeighbours(two, seven);
        this.four.setTopRight(two);
        this.four.setBottomRight(seven);

        this.five.setNeighbours(two, seven, eight, three);
        this.five.setTopLeft(two);
        this.five.setTopRight(three);
        this.five.setBottomLeft(seven);
        this.five.setBottomRight(eight);

        this.six.setNeighbours(three, eight);
        this.six.setTopLeft(three);
        this.six.setBottomLeft(eight);

        this.seven.setNeighbours(four, five, nine);
        this.seven.setTopLeft(four);
        this.seven.setTopRight(five);
        this.seven.setBottomRight(nine);

        this.eight.setNeighbours(five, six, nine);
        this.eight.setTopLeft(five);
        this.eight.setTopRight(six);
        this.eight.setBottomLeft(nine);

        this.nine.setNeighbours(seven, eight, ten, eleven);
        this.nine.setTopLeft(seven);
        this.nine.setTopRight(eight);
        this.nine.setBottomLeft(ten);
        this.nine.setBottomRight(eleven);

        this.ten.setNeighbours(nine, thirteen, twelve);
        this.ten.setTopRight(nine);
        this.ten.setBottomLeft(twelve);
        this.ten.setBottomRight(thirteen);

        this.eleven.setNeighbours(nine, fourteen, thirteen);
        this.eleven.setTopLeft(nine);
        this.eleven.setBottomLeft(thirteen);
        this.eleven.setBottomRight(fourteen);

        this.twelve.setNeighbours(ten, fifteen);
        this.twelve.setTopRight(ten);
        this.twelve.setBottomRight(fifteen);

        this.thirteen.setNeighbours(ten, eleven, sixteen, fifteen);
        this.thirteen.setTopLeft(ten);
        this.thirteen.setTopRight(eleven);
        this.thirteen.setBottomLeft(fifteen);
        this.thirteen.setBottomRight(sixteen);

        this.fourteen.setNeighbours(eleven, seventeen);
        this.fourteen.setTopLeft(eleven);
        this.fourteen.setBottomLeft(sixteen);

        this.fifteen.setNeighbours(twelve, thirteen, seventeen);
        this.fifteen.setTopLeft(twelve);
        this.fifteen.setTopRight(thirteen);
        this.fifteen.setBottomRight(seventeen);

        this.sixteen.setNeighbours(thirteen, fourteen, seventeen);
        this.sixteen.setTopLeft(thirteen);
        this.sixteen.setTopRight(fourteen);
        this.sixteen.setBottomLeft(seventeen);

        this.seventeen.setNeighbours(fifteen, sixteen);
        this.seventeen.setTopLeft(fifteen);
        this.seventeen.setTopRight(sixteen);
    }
    
    //TODO: Implement a better equals and hashcode method
    @Override
    public int hashCode() {
        int hash = 7;
        Node[] nodes = {one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen};
        for (Node node : nodes) {
            hash = 31 * hash + node.getValue();
        }
        return hash;
    }

    //TODO: Implement a better equals and hashcode method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GameBoard other = (GameBoard) obj;
        Node[] nodesThis = {one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen};
        Node[] nodesOther = {other.one, other.two, other.three, other.four, other.five, other.six, other.seven, other.eight, other.nine, other.ten, other.eleven, other.twelve, other.thirteen, other.fourteen, other.fifteen, other.sixteen, other.seventeen};
        for (int i = 0; i < nodesThis.length; i++) {
            if (nodesThis[i].getValue() != nodesOther[i].getValue()) {
                return false;
            }
        }
        return true;
    }
}
