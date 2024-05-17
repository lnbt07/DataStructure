package org.carolinabartoli.model.linkedList;

import org.carolinabartoli.model.Node;

public class DoublyLinkedListPlaylist {
    Node head;
    Node currentPlaying;
    Node tail;

    public DoublyLinkedListPlaylist(){
        head = null;
        currentPlaying = null;
        tail = null;
    }

    public void addSong(int songId){
        System.out.println("Adding the song "+ songId+" to the playlist.");
        Node newSong = new Node(songId);

        if(head == null){
            head = newSong;
            currentPlaying = newSong;
            tail = newSong;
            tail.next = head;
        } else {
            // o próximo da nova musica será o head
            newSong.next = head;
            // a próxima musica depois da ultima será a musica nova
            tail.next = newSong;
            // a ultima musica será a musica nova
            tail = newSong;
        }
    }

    public void nextSong(){
        if(currentPlaying != null){
            currentPlaying = currentPlaying.next;
            System.out.println("Changing to the next song, "+currentPlaying.value+", of the playlist.");
        }
    }

    public void prevSong(){
        Node temp = head;
        while(temp != null && temp.next != currentPlaying){
            temp = temp.next;
        }

        if(temp != null){
            currentPlaying = temp;
            System.out.println("Changing to the previous song, "+currentPlaying.value+", of the playlist.");
        }
    }

    public void switchSong(int songId){
        Node temp = head;
        do {
            if(temp.value == songId){
                currentPlaying = temp;
                System.out.println("Switching to the song "+currentPlaying.value+" of the playlist.");
            }
            temp = temp.next;
        } while (temp != head);
    }

    public int current(){
        return currentPlaying != null ? currentPlaying.value : -1;
    }
}
