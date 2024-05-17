package org.carolinabartoli.main;

import org.carolinabartoli.model.linkedList.CircularLinkedList;
import org.carolinabartoli.model.linkedList.DoublyLinkedList;
import org.carolinabartoli.model.linkedList.DoublyLinkedListPlaylist;
import org.carolinabartoli.model.linkedList.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        // Teste linkedList
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            int value = teclado.nextInt();
            list.insertAtEnd(value);
        }
        System.out.println(list);
        list.print();

        // Teste CircularLinkedList
        CircularLinkedList circularList = new CircularLinkedList();
        n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            int value = teclado.nextInt();
            circularList.insertAtEnd(value);
        }
        circularList.print();
        n = teclado.nextInt();
        circularList.delete(n);
        circularList.print();

        // Teste DoublyLinkedList
        DoublyLinkedList doublyList = new DoublyLinkedList();
        n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            int value = teclado.nextInt();
            System.out.println("Adding the value: " + value);
            doublyList.insertAtEnd(value);
        }
        doublyList.print();
        n = teclado.nextInt();
        System.out.println("Deleting the value: " + n);
        doublyList.deleteNode(n);
        doublyList.print();

        // Teste CircularLinkedList Josephus Problem
        int t = teclado.nextInt();
        while (t > 0) {
            n = teclado.nextInt();
            circularList = new CircularLinkedList();
            for (int i = 1; i <= n; i++) {
                circularList.insertAtEnd(i);
            }
            circularList.josephusProblem();
            t--;
        }

        //Teste DoublyLinkedList playlist
        n = teclado.nextInt();
        DoublyLinkedListPlaylist playlist = new DoublyLinkedListPlaylist();
        while (n > 0) {
            int q = teclado.nextInt();
            if (q == 1) {
                int songId = teclado.nextInt();
                playlist.addSong(songId);
            } else if (q == 2) {
                playlist.nextSong();
            } else if (q == 3) {
                playlist.prevSong();
            } else if (q == 4) {
                int songId = teclado.nextInt();
                playlist.switchSong(songId);
            } else {
                int ans = playlist.current();
                System.out.println(ans);
            }
            n--;
        }
    }
}