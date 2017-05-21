package package1;

public class HashMapImpl {

	static public class Node {
		String data;
		
		public Node(String data){
			this.data = data;
		}
	}
	
  static public class HashTable{
	 
	  private Node[] arr;
	  
	  private Node search(int key){
		  int index = hashFunction(key);
		  return arr[index];
	  }
	  
	  private void view(){
		  for(int i=0;i<arr.length;i++){
			  if(arr[i] !=null)
			  System.out.println(arr[i].data);
			  else
				  System.out.println("Empty");
		  }
	  }
	  
	  private int hashFunction(int key){
		  return key%arr.length;
	  }
	  
	  private int newIndexAfterLinearProbing(int firstIndex,int index,int conflictNo){
		  index = hashFunction(index+conflictNo);
		  if(index==firstIndex){
			  System.out.println("Hash Table is full. Delete some entries to add new.");
			  return -1;
		  }
		   if(arr[index]!=null){
			   return newIndexAfterLinearProbing(firstIndex,index, ++conflictNo);
		   }
		   else {
			   return index;
		   }
		  
	  }
	  private void insert(int key,Node node){
		  
		 // int index = key %arr.length;
		  int index = hashFunction(key);
		  if(arr[index]!=null){
		   int conflictNo =1; 
		  index = newIndexAfterLinearProbing(index,index,conflictNo);
		  
		  }
		  if(index !=-1)
		  arr[index] = node;
		  
		  
	  }
	  public HashTable(int n){
		  arr= new Node[n];
	  }
	  
	  
  }
  
  
  
  public static void main (String args[]){
	  
	  HashTable table = new HashTable(13);
	  
	  int key =1300;
	  Node value = new Node("Sameer");
	  table.insert(key,value);
	  
	  key =2600;
	  value = new Node("Suraj");
	  table.insert(key,value);
	  
	  key =3901;
	  value = new Node("Deepak");
	  table.insert(key,value);
	  
	  table.view();
	  
	   value =table.search(3901);
	   if(value!=null)
		   System.out.println("Found: "+value.data);
	  
	  
	  
  }
}
