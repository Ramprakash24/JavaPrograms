package treeProblems;
// Question : https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-heap/

class NodeTree{
	int key;
	NodeTree left, right;
	
	NodeTree(int k){
		key = k;
		left = right = null;
	}
}

public class IsHeapTree {
	public static void main(String args[]) {
		IsHeapTree iht = new IsHeapTree();
		
		NodeTree root = new NodeTree(10);
		root.left = new NodeTree(9);
		root.right = new NodeTree(8);
		root.left.left = new NodeTree(7); 
        root.left.right = new NodeTree(6); 
        root.right.left = new NodeTree(5); 
        root.right.right = new NodeTree(4); 
        root.left.left.left = new NodeTree(3); 
        root.left.right.right = new NodeTree(2); 
        root.left.right.left = new NodeTree(1);
        
        if(iht.isHeap(root))
        	System.out.println("Heap");
        else
        	System.out.println("Not Heap");
	}

	private boolean isHeap(NodeTree root) {
		if( root == null)
			return true;
		int nodeCount = countNodes(root);
		
		if(isCompleteUtil(root,0,nodeCount) && isHeapUtil(root))
			return true;
		return false;
	}

	private boolean isHeapUtil(NodeTree root) {
		if(root.left == null && root.right == null)
			return true;
		if(root.right == null)
			return root.key >= root.left.key;
		else {
			if(root.key >= root.left.key && root.key >= root.right.key)
				return isHeapUtil(root.left) && isHeapUtil(root.right);
		}
		return false;
	}

	private boolean isCompleteUtil(NodeTree root, int index, int count) {
		if(root == null)
			return true;
		
		if(index >= count)
			return false;
		
		return isCompleteUtil(root.left, 2 * index + 1, count) 
				&& isCompleteUtil(root.right, 2 * index + 2, count);
	}

	private int countNodes(NodeTree root) {
		if(root == null)
			return 0;
		return(1 + countNodes(root.left) + countNodes(root.right));
	}
}
