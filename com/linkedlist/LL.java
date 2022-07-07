package com.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import com.linkedlist.CustomLinkedList.Node;

public class LL {


	public static void main(String[] args) {
		CustomLinkedList cs = new CustomLinkedList();
		CustomLinkedList.Node nn= new CustomLinkedList.Node(0);
		
		
		
		long n = 100000;
		System.out.println(n*(n+1)*(2*n + 1));
		
		String s1 = "";
		String s4 = "flight";
		
		System.out.println(s4.indexOf(s1));
		String s2 = new String("Test");
//		System.out.println(s1.substring(1,1));
//		change(s1, s2);
//		System.out.println(s2);
		StringBuilder s = new StringBuilder();
//		s.append("hello");
//		s.length();
		System.out.println( (int)('A'+25));
		
		HashSet<String> c = new HashSet<String>();
		
		
//		while(n !=0)
//		{
//			cs.insert(n);
//			n = n - 1;
//		}
//		cs.printAll();
//		
//		reverse(cs);
//		System.out.println();
//		cs.printAll();
		
	}

	private static void change(String s1, String s2) {
		s1.concat("hello");
		s2.concat(" hello");
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
