package ex11;

import java.util.List;

public class Task11 {


    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int listLength(ListNode head)
    {
        if(head==null){
            return 0;
        }

        int count=0;
        ListNode current=head;
        //Until the end of the list
        while(current != null)
        {
            //increase the count for every node
            count++;
            //Go to next node
            current=current.next;
        }
        return count;

    }

    public void display(ListNode head)
    {
        //Check if the the list is empty
        if(head==null){
            return;
        }

        ListNode current=head;

        //Until the end of the list
        while(current!=null) {

            //Print the first element and goes to the next
            System.out.print(current.data + "->");
            current=current.next;
        }
        //At the end prints null
        System.out.println(current);
    }

    //Method that insert a node at the begin
    public ListNode insertAtBegin(ListNode head, int data) {

        //Create a the new node
        ListNode newNode = new ListNode(data);

        //If the list is empty
        if (head == null) {
            return newNode;
        }

        //New node point to the first
        newNode.next = head;
        //First now is the new node
        head = newNode;

        return head;
    }

    public ListNode insertAtEnd(ListNode head,int data){

        ListNode newNode=new ListNode(data);
        //Check if the list is empty
        if(head==null){
            return  newNode;
        }

        ListNode current=head;
        //Until the end of the list
        while (null !=current.next){
            current=current.next;
        }
        //End of the list now point to the newly created node
        current.next=newNode;
        return head;
    }

    public ListNode deleteFirst(ListNode head){
        //check if the list is empty
        if(head==null){
            return head;
        }

        //Make a temporary list
        ListNode temp=head;
        //head element now is the second element
        head=head.next;
        //Previous first value point to null
        temp.next=null;

        return head;
    }
//TODO make remove at given postion and remove at the end
}




