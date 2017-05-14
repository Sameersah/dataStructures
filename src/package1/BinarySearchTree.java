package package1;

import java.util.Queue;

import package1.BinarySearchTree.Node;

public class BinarySearchTree {
 
	Node root;
	Queue<Node> q;
	int nodeCounter;
	
	public BinarySearchTree () {
		q = new java.util.LinkedList<Node>();
		nodeCounter=0;
	}
	
	static class Node {
		public Node (int data){
			this.data = data;	
		}
		
		int data;
		Node left;
		Node right;
	}
	private Node add(Node curr,int data){
		
		if(curr==null){
			curr = new Node(data);
			
		}
		
		else if(curr.data<data){
			curr.right = add(curr.right,data);
		}
		else {
			curr.left = add(curr.left,data);
		}
		return curr;
	}
	
	
		
	
	private void levelOrderTraversal(Node curr){
		
		if(curr==null)
			return;
		
		System.out.print(curr.data+" ");
		if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
        if(q.peek()!=null)
        levelOrderTraversal( q.remove());
	}
	
	private int size(Node curr){
	   	
		if(curr!=null){
			nodeCounter++;
		}
		if(curr.left !=null){
			size(curr.left);
		}
		if(curr.right!=null){
			size(curr.right);
		}
		return nodeCounter;
	}
	
	
	
	private int getHeightOfTree(Node curr){
		
		if(curr==null){
			return 0;
		}
		else{
			return 1+ Math.max(getHeightOfTree(curr.left),getHeightOfTree(curr.right));
		}
	}
	
	public static void main (String args[]){
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.root = new Node(20);
		tree.add(tree.root,10);
		tree.add(tree.root,5);
		tree.add(tree.root, 30);
		tree.add(tree.root, 12);
		tree.add(tree.root, 14);
		
		System.out.print("Level order traversal: ");
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		
		int noOfNodes = tree.size(tree.root);
		System.out.println("No. of nodes: "+noOfNodes);
		
		int heightOfTree =  tree.getHeightOfTree(tree.root);
		System.out.println("Height of tree: "+heightOfTree);
	}
	
}
