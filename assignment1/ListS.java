package assignment1;

class Node {
    private Artist artist;

    Node(Artist artist) {
        this.artist = artist;
    }

    public Node() {
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
public class ListS {

        private Node head;
       private    Node  tail;
       private int count;
       private  Node next ;
       private  int index ;

    public ListS() {
    }

    public ListS(Node next, int index) {
        this.next = next;
        this.index = index;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
