package package1;

public class Stack {

	int arr[];
	int size;
	int top;
	
	public Stack(int n) {
		arr = new int[n];
		size = n;
		top=-1;
	}
	private void push(int data){
		if(top==size-1){
			System.out.println("Stack overflow");
			return;
		}
		else{
			arr[++top]= data;
		}
	}
	
	private int pop() {
		if(top==-1){
			System.out.println("Stack underflow");
			return -1;
		}
		else{
			return arr[top--];
		}
	}
	private void display(){
		int curr = top;
		while(curr!=-1){
			System.out.println(arr[curr]);
			curr--;
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		
		Stack stack = new Stack(10);
		
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		int data =stack.pop();
	//	data = stack.pop();
	System.out.println(data+"\n");
		stack.display();
	}
	
}
