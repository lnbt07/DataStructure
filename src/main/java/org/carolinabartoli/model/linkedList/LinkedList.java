package org.carolinabartoli.model.linkedList;

import org.carolinabartoli.model.Node;

public class LinkedList {
    Node head;
    Node tail;

    public void insertInFront(int value) {
        //Primeiro vamos gerar um novo nó, usando o valor informado
        Node newNode = new Node(value);

        // Depois iremos apontar o next desse novo node para o nosso Head atual
        newNode.next = head;

        // Por ultimo, vamos atualizar o head como nosso novo node, já que ele tem, agora,
        // o nosso head atual como próximo valor, o que faz ele antecessor na
        // lista de nós e torna ele nosso head
        head = newNode;
    }

    public int getHeadValue(){
        if(head == null){
            return -1;
        } else {
            return head.value;
        }
    }

    public void print(){
        System.out.print("Linked List: ");
        Node temp = this.head;
        while(temp!=null){
            System.out.printf("%d ",temp.value);
            temp=temp.next;
        }
        System.out.print("\n");
    }

    void insertAfterK(int value, int k) {
        Node newNode = new Node(value);
        Node current = head;

        // If there are no nodes in the linked list
        // Set the new node as head and return
        if (current == null) {
            head = newNode;
            return;
        }

        // Iterate to the k-th node
        for (int i = 1; i < k; i++) {
            current = current.next;
        }

        // Set the next of new Node to next of current
        newNode.next = current.next;

        // Set the next of current to new Node
        current.next = newNode;
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

        // Set next of tail to the new Node
        tail.next = newNode;

        // Set new Node as the new tail
        tail = newNode;
    }

    void deleteFirstNode(int value) {
        if (head.value == value) {
            Node targetNode = head;
            // Set head to the next of the current node
            head = targetNode.next;
        }
    }

    void deleteNode(int value) {
        if (head.value == value) {
            Node targetNode = head;
            head = head.next;
            return;
        }
        Node iter = head;
        // Traverse the list
        // When next element is our target element, eliminate it
        while (iter.next != null) {
            if (iter.next.value == value) {
                // Set next of iter
                // To next to next of iter
                iter.next = iter.next.next;

                return;
            }
            iter = iter.next;
        }
    }
}
