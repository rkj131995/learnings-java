package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

import com.linkedlist.CustomLinkedList.Node;

public class LL {


	public static void main(String[] args) {
		CustomLinkedList cs = new CustomLinkedList();
		
		int n = 7;
		while(n !=0)
		{
			cs.insert(n);
			n = n - 1;
		}
		cs.printAll();
		
		reverse(cs);
		System.out.println();
		cs.printAll();
		
	}

	private static void reverse(CustomLinkedList cs) {

		int k = cs.size;
		while(k >=1)
		{
			swap(cs, k);
			k--;
		}
	}

	private static void swap(CustomLinkedList cs, int k) {

		Node start = cs.head;
		int temp;
		while(k != 1)
		{
			 temp = start.data;
			 start.data = start.next.data;
			 start.next.data = temp;
			 
			 start = start.next;
			 k--;
		}
		
	}

}
