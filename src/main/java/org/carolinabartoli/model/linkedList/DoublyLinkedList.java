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

    public void deleteVal(int val){
        Node temp = head;
        while(temp.next != null && temp.value != val){

        }
    }
}
