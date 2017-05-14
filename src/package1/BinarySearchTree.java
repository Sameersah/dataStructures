package package1;

import java.util.Queue;

import package1.BinarySearchTree.Node;

public class BinarySearchTree {
 
	Node root;
	Queue<Node> q;
	
	public BinarySearchTree () {
		q = new java.util.LinkedList<Node>();
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
		
		System.out.println(curr.data);
		if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
        if(q.peek()!=null)
        levelOrderTraversal( q.remove());
	}
	
	public static void main (String args[]){
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.root = new Node(20);
		tree.add(tree.root,10);
		tree.add(tree.root,5);
		tree.add(tree.root, 30);
		tree.add(tree.root, 12);
		
		
		tree.levelOrderTraversal(tree.root);
	}
	
}
