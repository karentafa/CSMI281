/*

Name: Tapiwa Karen Tafa
Project Name: IntLinkedList
Date: 09/19/18

*/



import java.util.Scanner;
public class IntLinkedList {

    private Node head;
    private int  size;

    // the constructor
        IntLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void prepend( int dataToAdd ) {
        Node currentHead = head;
        head = new Node( dataToAdd );
        head.next = currentHead;
        size++;
    }

     public void removeAt (int index) {
        Node current = head,
        prev = null;

        
        while (current != null && index > 0) {
           
            prev = current;
            current = current.next;
            index--;
        }

        if (current == null) {return;}
        if (current == head) {
            head = current.next;
        }
        if (prev != null) {
            prev.next = current.next;
        }
        size--;
    }


        private class Node {
            int data;            // remember this is an IntLinkedList
            Node next;           // here's the self-referential part

            // constructor
            Node( int d ) {
                data = d;
                next = null;
            }
        }

        public void insertAt(int valueToAdd, int index) { 

        
        Node newNode = new Node(valueToAdd);

        Iterator previousNode = getIteratorAt(index - 1); 

        Node currentNode = previousNode.returnNode();

        newNode.next = currentNode.next;              
        currentNode.next = newNode;    


        size++;

        }


    public Iterator getIteratorAt( int index ) {
        if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
        }
        Iterator it = new Iterator();
        while( index > 0 ) {
            it.next();
            index--;
        }
        return it;
    }


public class Iterator {
    private Node currentNode;

    Iterator() {
        currentNode = head;
    }

    public void next() {
        if( currentNode == null ) {
            return;
        } else {
            currentNode = currentNode.next;
        }
    }

    public Node returnNode(){

        return currentNode;
    }

    public boolean hasNext() {
        return ((currentNode != null) && (currentNode.next != null));
    }

    public int getCurrentInt() {
        return currentNode.data;
    }


}

   }

