package binarysearchtree;

public class Driver {
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(10);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(15);
		tree.printInOrderTraversal(tree.root);
		System.out.println();
		tree.printPostOrderTraversal(tree.root);
		System.out.println();
		tree.printPreOrderTraversal(tree.root);
		
	}
}
