package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
           LinkedList<Integer> linkedList1=new LinkedList<>();
           linkedList1.push(70);
           linkedList1.push(30);
           linkedList1.push(56);
           linkedList1.print();

           LinkedList<Integer> linkedList2=new LinkedList<>();
           linkedList2.add(56);
           linkedList2.add(30);
           linkedList2.add(70);
           linkedList2.print();
    }
}
