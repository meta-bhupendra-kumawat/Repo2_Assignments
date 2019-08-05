import java.util.List;

public class UseBST {
	
	public static void main(String args[]) throws Exception {
		BinarySearchTree bTree = new BinarySearchTree();
//		bTree.add(1, "One");
//		bTree.add(2, "Two");
//		bTree.add(3, "Three");
//		bTree.add(4, "Four");
//		bTree.inorder(bTree.root);
		
		// GetJSON object for fetching data.
		GetJSON gJson = new GetJSON();
		
		// Fetching data from JSON in ArrayList of BSTNode.
		List<BSTNode> data = gJson.getJSON();
		
		// Inserting data to Binary Search tree.
		for(BSTNode node : data) {
			bTree.add(node);
		}
		
		bTree.inorder(bTree.root);
		System.out.println("uoou");
		
		
	}

}
