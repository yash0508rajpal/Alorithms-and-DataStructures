package binarysearch;

public class BinarySearchTree {
	Node root;
	Node prev;
	
	public BinarySearchTree(){
		root = null;
	}
	/*public void insert(int key){
		root = insertNode(root,key);
	}*/
	
	/*public Node insertNode(Node root,int key){
		
		if(root == null){
			root = new Node(key);
			return root;
		}
		else if(key < root.key){
			root.left =  insertNode(root.left,key);
		}
		else if(key > root.key){
			root.right =  insertNode(root.right,key);
		}
		return root;
	}*/
	
	public boolean isBST(){
		prev = null;
		return isBST(root);
	}
	
	public boolean isBST(Node node){
		if(node!=null){
			if(!isBST(node.left)){
				return false;
			}
			if(prev !=null && node.key <= prev.key){
				return false;
			}
			prev = node;
			return isBST(node.right);
		}
		
		return true;
	}
	
	public static void main(String[] args){
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(10);
		tree.root.right =new Node(20);
		tree.root.left = new Node(5);
		/*tree.root.left.left= new Node(4);
		tree.root.right.right = new Node(25);
		tree.root.left.left.right = new Node(2);*/
		if(tree.isBST()){
			System.out.println("Is a Binary Search tree");
		}
		else{
			System.out.println("Not a Binary Search tree");
		}
		
		
	}
}
