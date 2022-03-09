package com.Sayan;

 class Node{
   public int data;
   public Node next;
 }

public class MyLinkedList {

  private Node head;

   public boolean isEmpty()
   {

               return (head == null);
   }

    public void insertfirstdata(int data) {
       Node newnode = new Node ();
        newnode.data = data;
        newnode.next = head;
        head = newnode;
    }
    public void insertlastdata(int data){
       Node curent = head;
       Node newnode = new Node();
       newnode.data = data;
       newnode.next = null;
       while (curent.next != null){
           curent = curent.next;
       }
       curent.next = newnode;
    }
    public Node deletefirst() {
//       Node temp = head;
//       head = head.next;
//       temp = head;
//       return temp;
        head = head.next;
        return head;
   }
   public void  printAllElement(){
       Node current = head;
       while (current!=null) {
           System.out.println (current.data);
           current=current.next;


       }
   }
}