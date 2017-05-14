package package1;

import java.util.Queue;

public class LinkedList  {

	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	private  void print (){
		Node printPointer = head;
		while (printPointer != null){
			System.out.println(printPointer.data);
			printPointer= printPointer.next;
		}
		System.out.println();
	}
	
	private void addInFront(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	private void addAtLast(int data){
		Node newNode = new Node(data);
		Node nodeTraversar = head;
		while(nodeTraversar.next != null){
			nodeTraversar = nodeTraversar.next;
		}
		nodeTraversar.next = newNode;
	}
	
	public Node getNthNode(int index){
		Node temp= head;
		
		for(int i=0;i<index;i++){
			if(temp==null){
				
				return null;
			}
			temp= temp.next;
		}
		return temp;
	}
	
	public Node getMiddleElement(){
		
		Node temp = head;
		int len =0;
		while(temp.next!=null){
			len++;
			temp= temp.next;
		}
		
		int index;
		if(len%2==0){
			index = (len+1)/2;
		}
		else{
			index= len/2;
		}
		
		temp= head;
		for(int i=0;i<index;i++){
			temp= temp.next;
		}
		return temp;
	}
	
	private Node getNthNodeFromLast(int nodeNo) {
		Node temp = head;
		
		int len =0;
		while(temp != null){
			len++;
			temp =temp.next;
		}
		
		int index = len-nodeNo;
		// System.out.println("index:"+len);
		if(index<0 || index>len){
			return null;
		}
		else {
			temp= head;
			for(int i=0;i<index;i++){
				temp= temp.next;
			}
			return temp;
		}
		
		
	}
	
	private void delete(int data){
		Node curr = head;
		Node pre = null;
		
		while(curr != null ){
			if(curr.data==data){
				pre.next = curr.next;
				break;
			}
			pre = curr;
			curr = curr.next;
		}
		
	
		
	}
	
	private void reverse(Node pre, Node curr){
		
		if(curr==null){
			head= pre;
		}
		else{
			reverse(curr,curr.next);
			curr.next = pre;
		}
		
	}
	public static void main(String args[]){
		
		LinkedList list = new LinkedList();
		list.head = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);
		
		list.head.next = second;
		second.next = third;
		
		list.print();
		list.addInFront(10);
		list.print();
		list.addAtLast(50);
		list.print();
		Node node =list.getNthNode(5);
		if(node!=null)
		System.out.println(node.data);
		
		 node =list.getMiddleElement();
		if(node!=null){
			System.out.println("middle element"+node.data);
		}
		
		node = list.getNthNodeFromLast(3);
		
		if(node!=null){
			System.out.println("Nth node from last: "+node.data);
		}
		
		list.delete(50);
		list.print();
		list.reverse(null, list.head);
		list.print();
		
		
	}

	
}
