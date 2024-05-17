package org.carolinabartoli.main;

import org.carolinabartoli.model.linkedList.CircularLinkedList;
import org.carolinabartoli.model.linkedList.DoublyLinkedList;
import org.carolinabartoli.model.linkedList.DoublyLinkedListPlaylist;
import org.carolinabartoli.model.linkedList.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Teste LinkedList
        System.out.println(":::Operations using LinkedList:::");
        LinkedList list = new LinkedList();
        for (int i = 0; i < 3; i++) {
            list.insertAtEnd(i);
        }
        list.print();
        System.out.println();

        // Teste CircularLinkedList
        System.out.println(":::Operations using CircularLinkedList:::");
        CircularLinkedList circularList = new CircularLinkedList();
        for (int i = 0; i < 5; i++) {
            circularList.insertAtEnd(i + 1);
        }
        circularList.print();
        circularList.delete(3);
        circularList.print();
        System.out.println();


        // Teste DoublyLinkedList
        System.out.println(":::Operations using DoublyLinkedList:::");
        DoublyLinkedList doublyList = new DoublyLinkedList();
        for (int i = 0; i < 5; i++) {
            doublyList.insertAtEnd(i);
        }
        doublyList.print();
        doublyList.deleteNode(3);
        doublyList.print();
        doublyList.insertAtIndex(3, 3);
        doublyList.print();
        System.out.println();


        // Teste CircularLinkedList Josephus Problem
        System.out.println(":::Josephus Problem operations using CircularLinkedList:::");
        circularList = new CircularLinkedList();
        for (int i = 1; i <= 5; i++) {
            circularList.insertAtEnd(i);
        }
        circularList.print();
        circularList.josephusProblem();
        System.out.println();

        //Teste DoublyLinkedList playlist
        System.out.println(":::Playlist operations using DoublyLinkedList:::");
        DoublyLinkedListPlaylist playlist = new DoublyLinkedListPlaylist();
        Integer[] values = {1, 1, 1, 5, 2, 5, 3, 5, 1, 1, 2, 2, 4, 5, 2, 5};
        int j = 0;
        for (int i = 0; i < values.length; i++) {
            int q = values[i];
            if (q == 1) {
                playlist.addSong(j);
                j++;
            } else if (q == 2) {
                playlist.nextSong();
            } else if (q == 3) {
                playlist.prevSong();
            } else if (q == 4) {
                playlist.switchSong(1);
            } else {
                int ans = playlist.current();
                System.out.println("Currently playing the " + ans + " song of the playlist.");
            }
        }

    }
}