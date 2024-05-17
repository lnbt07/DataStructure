package org.carolinabartoli.model.linkedList;

import org.carolinabartoli.model.Node;

public class CircularLinkedList {
    Node head;
    Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            // When the list is not empty
            // Adding a new element towards the end of list
            this.tail.next = newNode;
            // Updating the tail pointer so that it points to the last element
            this.tail = newNode;
        }
        // The last element always points to the head
        this.tail.next = head;
    }

    public void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.printf("%d ", temp.value);
            if (temp == this.tail) break;
            temp = temp.next;
        }
        System.out.print("\n");
    }

    public void delete(int val) {
        Node newNode = null;
        if (this.tail == this.head && this.tail.value == val) {
            this.head = null;
            this.tail = null;
        }
        Node temp = this.head;
        if (this.head.value == val) {
            this.head = this.head.next;
            this.tail.next = this.head;
        } else {
            while (temp.next != null && temp != this.tail) {
                if (temp.next.value == val) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void josephusProblem(){
        Node player = head;
        while(player.next != null){
            Node receiveKnife = player.next.next;
            if(player.next == head){
                head = receiveKnife;
            }
            player.next = receiveKnife;
            player = player.next;
        }
        System.out.println("The winner of the Josephus Game is "+player.value);
    }
}
