public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add("Ich");
        list.add("heisse");
        list.add("Umut");
        list.add("Savas");
        list.removeLast();
        list.insert(2, "TEST");
        list.remove(2);
        System.out.println(list.showElements(list.getHead(), ""));
        System.out.println(list.showReverse(list.getHead(), new StringBuilder()));
    }
}
