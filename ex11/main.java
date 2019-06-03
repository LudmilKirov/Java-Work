package ex11;

public class main {
    public static void main(String[] args) {

        Task11 LinkedList = new Task11();

        LinkedList.insertAtBegin(1);
        LinkedList.display();

        LinkedList.insertAtEnd(2);
        LinkedList.display();

        LinkedList.insertAtBegin(3);
        LinkedList.display();

        LinkedList.deleteFirst();
        LinkedList.display();

        LinkedList.deleteLast();
        LinkedList.display();

        LinkedList.insertAtEnd(2);
        LinkedList.insertAtBegin(3);

        LinkedList.deleteNodeByData(1);
        LinkedList.display();

        LinkedList.deleteLast();
        LinkedList.display();

        LinkedList.deleteLast();
        LinkedList.display();

        LinkedList.insertAtBegin(22);
        LinkedList.display();

        if(LinkedList.findNodeData(22)){
            System.out.println("Node is in the list");
        }
        else{
            System.out.println("Node is not in the list");
        }


    }
}