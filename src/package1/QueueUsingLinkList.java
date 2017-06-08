package package1;

public class QueueUsingLinkList {

	private static class Node {
		int data;
		Node next;
		
		public Node(int data){
			this.data= data;
		}
	}
	
	Node front,rear;
	
	public boolean isEmpty(){
		if(front==null && rear ==null){
			return true;
		}
		else {
			 return false;
		}
	}
	
	public void enqueue(int data){
		if(isEmpty()){
			front = new Node(data);
			rear =front;
		}
		else{
			rear.next= new Node(data);
			rear = rear.next;
		}
	}
	
	public void display(){
		Node temp =front;
		while(temp != rear.next){
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println();
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int data = front.data;
			front= front.next;
			return data;
		}
	}
	public static void main(String args[]){
		
		QueueUsingLinkList queue = new QueueUsingLinkList();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.display();
		queue.dequeue();
		queue.display();
	}
}
