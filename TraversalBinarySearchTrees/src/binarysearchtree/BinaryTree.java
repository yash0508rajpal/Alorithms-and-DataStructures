package binarysearchtree;

public class BinaryTree {
	Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	
	public void printInOrderTraversal(Node node){
		if(node == null)
			return;
		
		printInOrderTraversal(node.left);
		System.out.print(node.key + " ");
		printInOrderTraversal(node.right);
	}
	
	public void printPostOrderTraversal(Node node){
		if(node == null){
			return;
		}
		printPostOrderTraversal(node.left);
		printPostOrderTraversal(node.right);
		System.out.print(node.key + " ");
		
	}
	
public void printPreOrderTraversal(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.key + " ");
		printPreOrderTraversal(node.left);
		printPreOrderTraversal(node.right);
	}
}
