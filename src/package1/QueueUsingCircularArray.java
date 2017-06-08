package package1;

public class QueueUsingCircularArray {

	int arr[];
	int front,rear;
	public QueueUsingCircularArray(int size){
		arr =new int[size];
		front=-1;
		rear =-1;
	}
	public boolean isEmpty(){
		if(front==-1 && rear==-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isFull(){
		if((rear+1)%arr.length==front){
			return true;
		}
		else{
			return false;
		}
	}
	public void enqueue(int data){
		if(isEmpty()){
			front++;
			rear++;
			arr[rear]= data;
		}
		else if(isFull()){
			System.out.println("Queue is full. Cannot add "+data);
			return ;
		}
		else {
			rear = (rear +1)%arr.length;
			arr[rear]=data;
		}
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("The Queue is empty.");
		}
		else{
			int i=front;
			do {
				System.out.println(arr[i]);
				i= (i+1)%arr.length;
			}while(i!=(rear+1)%arr.length);
			
			/*for(int i=front;i!=(rear+1)%arr.length;i=(i+1)%arr.length){
				System.out.println(arr[i]);
			}*/
			System.out.println();
		}
	}
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int data= arr[front];
			front = (front+1)%arr.length;
			return data;
		}
	}
	
	public static void main (String args[]){
		 QueueUsingCircularArray queue= new QueueUsingCircularArray(4);
		 
		 queue.enqueue(10);
		 queue.enqueue(20);
		 queue.enqueue(30);
		 queue.enqueue(40);
		 
		 queue.display();
		 queue.enqueue(50);
		 
		 queue.dequeue();
		 queue.display();
		 
		 queue.enqueue(50);
		 queue.display();
		 
		 
	}
}
