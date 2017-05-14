package package1;

public class Queue {

	int arr[];
	int top,rear,size;
	
	public Queue(int n) {
		arr = new int[n];
		top=0;
		rear= -1;
		size=n;
	}
	
	private void add(int data){
		
		if(top==size){
			System.out.println("Queue Overflow");
		}
		else{
			arr[top++]=data;
			if(rear==-1)
				rear++;
		}
	}
	
	private int remove(){
		if(rear==top ){
			System.out.println("Empty Queue");
			return -1;
		}
		else {
			return arr[rear++];	
		}
			
	}
	
	private void printQueue(){
		 for(int i=rear;i<top;i++){
			 System.out.print(arr[i]+" ");
		 }
	}
	
	public static void main(String args[]){
		
		Queue q = new Queue(10);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.printQueue();
		System.out.println();
	    System.out.println("Removed Data: "+q.remove());
		q.printQueue();
	}
	
}
