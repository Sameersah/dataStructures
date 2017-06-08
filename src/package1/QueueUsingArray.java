package package1;

public class QueueUsingArray {

	
	
	
		private int arr[];
		private int front,rear;
		
		public QueueUsingArray(int size){
			arr = new int[size];
			front=-1;
			rear=-1;
		}
	public boolean isFull(){
		if(rear== arr.length-1){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty(){
		if(front==-1 && rear==-1){
			return true;
		}
		else {
			return false;
		}
	}
	public void enqueue(int data){
		if(isFull()){
			System.out.println("Queue is full");
			return ;
		}
		else if(isEmpty()){
			rear++;
			front++;
			arr[rear]= data;
			//System.out.println(rear+" :"+front);
		}
		else {
			arr[++rear]=data;
		}
	}
	
	public void display(){
		if(isEmpty() ){
			System.out.println("Queue is Empty");
		}
		else {
			for(int i=front;i<=rear;i++){
				System.out.println(arr[i]);
			}
			System.out.println();
		}
		
	}
		public int dequeue(){
			return arr[front++];
		}
	public static void main(String args[]){
		QueueUsingArray queue = new QueueUsingArray(10);
		queue.enqueue(10);
		//queue.display();
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		queue.dequeue();
		queue.display();
		
		queue.enqueue(40);
		queue.display();
		
		
		
		
		
	}
	
}
