package main;

public class LinkedList {
    public static void main(String[] args) {
        Node current = null;
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.name = "Mambaur Roziq Alwi";
        first.next = second;
        second.name = "Ahira Labata";
        second.next = third;
        third.name = "Rezhi Sylvia";
        third.next = null;
        current = first; // set pointer to node first

        while (current != null){
            System.out.println(current.name);
            current = current.next;
        }
    }
}

class Node{
    String name;
    Node next;
}