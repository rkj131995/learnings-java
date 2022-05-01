package com.linkedlist;

public class CustomLinkedList {
    Node head; // head of list
    int size;
    
    CustomLinkedList()
    {
    	this.size = 0;
    }
    
    public void printAll()
    {
    	Node n = this.head;
    	while(n != null)
    	{
    		System.out.print(n.data+" -> ");
    		n = n.next;
    	}
    }
    public void insert(int data)
    {
    	Node newNode = new Node(data);
    	if(size == 0)
    	{
    		this.head = newNode;
    		this.size++;
    	}
    	else
    	{
    		Node last = this.head;
    		while(last.next != null)
    		{
    			last = last.next;
    		}
    		last.next = newNode;
    		this.size++;
    	}
    }
    /* Linked list Node.  This inner class is made static so that
       main() can access it */
      static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        } // Constructor
    }
 
    
}
