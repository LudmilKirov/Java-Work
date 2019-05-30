package ex11;

public class main {
    public static void main(String[] args) {

        Task11 LinkedList = new Task11();

        Task11.ListNode head = new Task11.ListNode(10);
        LinkedList.display(head);

        Task11.ListNode newNode = LinkedList.insertAtBegin(head, 221);
        LinkedList.display(newNode);

        Task11.ListNode newNode1 = LinkedList.insertAtBegin(newNode, 2211);
        LinkedList.display(newNode1);

        System.out.print("Length: "+LinkedList.listLength(newNode1)+"\n");

        Task11.ListNode newNode2 = LinkedList.insertAtEnd(head, 0);
        LinkedList.display(newNode1);

        LinkedList.deleteFirst(newNode1);
        LinkedList.display(newNode);

    }
}