package package1;

public class LinkedListNodeExchange {

	public static class Node {
		
		public Node(int data){
			this.data= data;
		}
		int data;
		Node next;
	}
	
	Node head;
	
	public void append (int data){
		Node temp = head;
		
		while(temp.next !=null){
			temp =temp.next;
		}
		
		Node node = new Node(data);
		temp.next = node;
		
	}
	
	public void print(){
		Node temp = head;
		
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public Node searchPreNode(int data){
		Node temp =head;
		
		if(head.data ==data){
			return head;
		}
		while(temp.next.data != data){
			temp= temp.next;
		}
		return temp;
	}
	
	public void exchange(int data1,int data2){
		
		Node node1 = searchPreNode(data1);
		Node node2 = searchPreNode(data2);
		
		//System.out.println(node1.data+"54:::"+node2.data);
		if(node1 == null || node2 == null){
			System.out.println("Nodes not found");
			System.out.println();
		}
		else if(node1==head) {
			Node temp = node1.next;
			head = node2.next;
			node2.next.next = temp;
			node2.next = node2.next.next;
			
		}
		else {
			Node temp = node1.next;
			node1.next = node2.next;
			node2.next = temp;
			
		}
	
	}
	public static void main(String args[]){
		
		LinkedListNodeExchange list = new LinkedListNodeExchange();
		
		list.head = new Node(20);
		list.append(30);
		list.print();
		list.exchange(20,30);
		list.print();
	}
}
