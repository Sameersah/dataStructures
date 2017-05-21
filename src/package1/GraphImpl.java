package package1;

public class GraphImpl {
    
	static public class Graph {
		
		int arr[][];
		public Graph(int vnum) {
		 arr = new int[vnum][vnum];	
		}
		private void breadthFirstTraversal(){
			//to be done..
		}
		
		private void view(){
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.print("\n");
			}
		}
		
		private void addEdge(int u,int v){
			arr[u][v]= 1;
		}
		
	}
	
	
	public static void main(String args[]){
		Graph graph = new Graph(5);
		
		graph.addEdge(3,4);
		graph.view();
		
		graph.breadthFirstTraversal();
	}
}
