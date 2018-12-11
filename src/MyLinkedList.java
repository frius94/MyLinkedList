public class MyLinkedList {
    private Node head;
    private int listCount;

    public MyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    /**
     * Add a Node at the end
     * @param value
     */
    public void add(String value) {
        Node newElement = new Node(value);
        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newElement);
        listCount++;
    }

    /**
     * Remove the last Node
     */
    public void removeLast() {
        Node current = head;
        for (int i = 0; i < listCount - 1; i++) {
            current = current.getNext();
        }
        listCount--;
        current.setNext(null);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getListCount() {
        return listCount;
    }

    public void setListCount(int listCount) {
        this.listCount = listCount;
    }


    /**
     * Return String instance containing myLinkedList content
     * @param node
     * @param value
     * @return
     */
    public String showElements(Node node, String value) {
        if (head.getItem() != null) {
            value += head.getItem();
        }
        if (node.getItem() != null) {
            value += node.getItem() + " ";
        }
        if (node.getNext() != null) {
            return showElements(node.getNext(), value);
        }
        return value;
    }

    /**
     * Return Stringbuilder instance containing myLinkedList in reverse order
     * @param node
     * @param value
     * @return
     */
    public StringBuilder showReverse(Node node, StringBuilder value) {
        if (head.getItem() != null) {
            value.append(head.getItem());
        }
        if (node.getItem() != null) {
            value.insert(0, node.getItem() + " ");
        }
        if (node.getNext() != null) {
            return showReverse(node.getNext(), value);
        }
        return value;
    }

    /**
     * Insert Node at a specific position
     * @param offset
     * @param value
     */
    public void insert(int offset, String value) {
        Node current = head;
        for (int i = 0; i < offset; i++) {
            current = current.getNext();
        }
        Node rightPart = current.getNext();
        current.setNext(new Node(value, rightPart));
    }

    /**
     * Insert Node to the Beginning
     * @param value
     */
    public void addFirst(String value) {
        insert(0, value);
    }

    /**
     * Remove Node at a specific position
     * @param offset
     */
    public void remove(int offset) {
        Node current = head;
        Node rightPart = head;

        for (int i = 0; i < offset; i++) {
            current = current.getNext();
        }

        for (int i = 0; i <= offset + 1; i++) {
            rightPart = rightPart.getNext();
        }

        current.setNext(rightPart);
    }

    /**
     * Merge two nodes together
     * @param left
     * @param right
     */
    public void insertAfter(Node left, Node right) {
        left.setNext(right);
    }
}
