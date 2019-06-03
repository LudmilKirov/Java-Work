package ex11;

import java.util.List;

public class Task11 {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;



        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int listLength()
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

    public void display()
    {
        //Check if the the list is empty
        if(head==null){
            System.out.println("List is empty");
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
    public void insertAtBegin(int data) {

        //Create a the new node
        ListNode newNode = new ListNode(data);

        //New node point to the first
        newNode.next = head;
        //First now is the new node
        head = newNode;

    }

    public void insertAtEnd(int data){

        ListNode newNode=new ListNode(data);
        //Check if the list is empty
        if(head==null){
            System.out.println("List is empty");
            return ;
        }

        ListNode current=head;
        //Until the end of the list
        while (null !=current.next){
            current=current.next;
        }
        //End of the list now point to the newly created node
        current.next=newNode;
        return ;
    }

    public void deleteFirst(){
        //check if the list is empty
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        //Make a temporary list
        ListNode temp=head;
        //head element now is the second element
        head=head.next;
        //Previous first value point to null
        temp.next=null;

        return;
    }
//TODO make remove at given data and remove at the end

    public void deleteLast(){
        //check if the list is empty
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        ListNode last=head;
        ListNode previousToLast=null;

        //Until the last node,safe the previous node and move to the next
        while(last.next != null){
            previousToLast=last;
            last =last.next;
        }

        //if there is one element point the head to null and return
        if (previousToLast == null){
            head=null;
            return;
        }
        //To delete the node point the previous to null
        previousToLast.next=null;

    }

    public void deleteNodeByData(int data){
        ListNode current=head;
        ListNode temp=null;

        //If the data is the data of the first node
        if(current != null && current.data==data){
            head=current.next;
            return;
        }

        //Until the end of the list
        while(current != null && current.data!=data){
            temp=current;
            current=current.next;
        }

        //If the data is not the data of any node of the list-return
        if(current==null){
            return;
        }

        //To delete the data,just point the the previous node of the node
        // with the matching data to the next node of the matching data
        temp.next=current.next;

    }

    public boolean findNodeData(int searchKey){

        //If the list is empty print that the list is empty and return false
        if(head==null){
            System.out.println("List is empty");
            return false;
        }

        ListNode current=head;

        //Until the end of the linked list
        while(current != null) {
            //If there is match between the data that is
            // searched and the data of the node return true
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}




