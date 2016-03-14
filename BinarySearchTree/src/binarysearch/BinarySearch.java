package binarysearch;

public class BinarySearch {
	Node root;
	BinarySearch(){
		root = null;
	}
	
	public Node insertNode(Node root,int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
			if(key < root.key){
				root.left = insertNode(root.left,key);
			}
			else if(key > root.key){
				root.right = insertNode(root.right,key);
			}
				
		
		
		return root;
	}
	
	public Node searchKey(Node root,int key){
		if(root == null || root.key == key){
			return root;
		}
		else if(key < root.key ){
			return searchKey(root.left,key);
		}
		else
			return searchKey(root.right,key);
	}
	
	public void insert(int key){
		root = insertNode(root, key);
	}
	
	public void printInorder(Node root){
		if(root == null){
			return;
		}
		else{
			printInorder(root.left);
			System.out.print(root.key + " ");
			printInorder(root.right);
		}
	}
	
	public static void main(String[] args){
		BinarySearch tree = new BinarySearch();
		tree.insert(10);
		tree.insert(20);
		tree.insert(15);
		tree.insert(2);
		tree.insert(1);
		tree.insert(5);
		tree.printInorder(tree.root);
		
		// Search in BinarySearch tree
		Node node = tree.searchKey(tree.root,5);
		if(node == null){
			System.out.println("Not found");
		}
		else
		System.out.println("Found");
	}
	
}
