package binarysearchtree;

public class BinaryTree {
	Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	public int height(Node node){
		if(node == null)
		return 0;
		
		int lHeight = height(node.left);
		int rHeight = height(node.right);
		if(lHeight > rHeight){
			return(lHeight +1);
		}
		else
			return(rHeight + 1);
		
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(7);	
		tree.root.left.right = new Node(10);
		tree.root.left.left.left = new Node(2);
		System.out.println(tree.height(tree.root));
		}
	
}
