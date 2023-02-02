package abstract_classes.challenge;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "1 3 55 2 1 5 7 3";

        String[] data = stringData.split(" ");
        for(String s : data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

    }
}
