public class BinaryTrees {
	Node root;
	public BinaryTrees(){
		root = null;
	}
	
	
	
	public void levelOrder(Node root){
		int h = height(root);
		for(int i= 1;i<=h;i++){
			printLevel(root,i);
			System.out.println();
		}
	}
	
	public void printLevel(Node root, int level){
		if(root == null){
			return;
		}
		if(level == 1){
			System.out.print(root.key + " ");
		}
		else if(level > 1){
			printLevel(root.left,level-1);
			printLevel(root.right,level-1);
		}
		
	}
	
	int height(Node root){
		if(root == null)
			return 0;
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		if(lHeight > rHeight){
			return(lHeight  +1);
		}
		else
			return (rHeight + 1);
	}
	
	
	public static void main(String[] args){
		BinaryTrees tree = new BinaryTrees();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.levelOrder(tree.root);
		
		
	}
}
