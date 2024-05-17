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
        Node temp = head;
        System.out.println("Temp value: "+temp.value);
        while(temp != null && temp.value != val){
            temp = temp.next;
            System.out.println("Temp value: "+temp.value);
        }

        if(temp == null){
            System.out.println("Temp  null: ");
            return;
        }

        Node A = temp.prev;
        System.out.println("A value: "+A.value);
        Node B = temp.next;
        System.out.println("B value: "+B.value);

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
        Node temp = this.head;
        while(temp!=null){
            System.out.printf("%d ",temp.value);
            temp=temp.next;
        }
        System.out.print("\n");
    }
}
