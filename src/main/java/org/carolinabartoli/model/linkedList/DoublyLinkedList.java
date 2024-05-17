package org.carolinabartoli.model.linkedList;

import org.carolinabartoli.model.Node;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtIndex(int index, int val){
        System.out.println("Inserting the value "+val+" at the index "+index);
        Node newNode = new Node(val);

        if(index == 0){
            newNode.next = head;
            if(head != null){
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            Node A = temp;
            Node B = temp.next;

            A.next = newNode;
            newNode.prev = A;
            if(B != null){
                B.prev = newNode;
            }
            newNode.next = B;
        }
    }

    public void deleteNode(int val){
        System.out.println("Deleting the value from the doublyList: " + val);
        Node temp = head;
        while(temp != null && temp.value != val){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Temp  null: ");
            return;
        }

        Node A = temp.prev;
        Node B = temp.next;

        if(A != null){
            A.next = B;
        }

        if (B != null){
            B.prev = A;
        }

        if(temp == head){
            head = head.next;
        }
    }

    public void insertAtEnd(int value) {
        System.out.println("Adding the value at the doublyList: " + value);
        Node newNode = new Node(value);

        // If there are no nodes in the linked list
        // Set the new node as head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // Set the prev of the newNode
        newNode.prev = tail;
        // Set next of tail to the new Node
        tail.next = newNode;

        // Set new Node as the new tail
        tail = newNode;
    }

    public void print(){
        System.out.print("Doubly Linked List: ");
        Node temp = this.head;
        while(temp!=null){
            System.out.printf("%d ",temp.value);
            temp=temp.next;
        }
        System.out.print("\n");
    }
}
