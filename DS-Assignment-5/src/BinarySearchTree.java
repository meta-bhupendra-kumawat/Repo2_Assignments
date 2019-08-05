import java.util.Map;

public class BinarySearchTree implements Dictionary {

	BSTNode root;
	int flag = 0;
//	BSTNode newNode;
	
	@Override
	public void add(BSTNode newNode) {
//		newNode = new BSTNode();
//		newNode.key = key;
//		newNode.value = value;
		if(root == null)
			root = newNode;
		else {
			BSTNode current = root;
			BSTNode prev = root;
			while(current != null) {
				prev = current;
				if(newNode.key > current.key)
					current = current.right;
				else
					current = current.left;
			}
			if(prev.key > newNode.key)
				prev.left = newNode;
			else
				prev.right = newNode;
		}
	}
	
	public void inorder(BSTNode root) {
		
		if(root.left != null)
			inorder(root.left);
		
		System.out.print(root.key + "-" + root.value + " ");
		
		if(root.right != null)
			inorder(root.right);
		
	}

//	@Override
//	public String delete(int key) {
//		BSTNode temp = root;
//		BSTNode prev = root;
//		
//		while(temp.key != key && temp != null) {
//			prev = temp;
//			if(temp.key > key) {
//				flag = 1;
//				temp = temp.left;
//			}
//			if(temp.key < key) {
//				flag = 0;
//				temp = temp.right;
//			}
//		}
//		// When key doesn't exists.
//		if(temp == null)
//			return null;
//		
//		// When deleted node is leaf node.
//		if(temp.left == null && temp.right == null)
//		{
//			if(this.isLeftOfRoot())
//				prev.left = null;
//			else
//				prev.right = null;
//			return "Leaf Deleted";
//		}
//		
//		// When left child of deleted node doesn't exist.
//		if(temp.key == key && temp.left == null) {
//			if(this.isLeftOfRoot()) 
//				prev.left = temp.right;
//			else
//				prev.right = temp.right;
//			return "Node with no left child";
//		}
//		
//		// When right child of deleted node doesn't exist.
//		if(temp.key == key && temp.right == null) {
//			if(this.isLeftOfRoot()) 
//				prev.left = temp.left;
//			else
//				prev.right = temp.left;	
//			return "Node with no right child";
//		}
//		
//		if(temp.key == key) {
//			
//		}
//			
//		return null;
//	}
	
	@Override
	public BSTNode delete(BSTNode root, int key) {
		if(root == null)
			return null;
		else if(key < root.key) 
			root.left = delete(root.left, key);
		else if(key > root.key)
			root.right = delete(root.right, key);
		else {
			// When deleted node is leaf node.
			if(root.left == null && root.right == null)
				return null;
			
			// When left child of deleted node doesn't exist.
			else if(root.left == null)
				root = root.right;
			
			// When left child of deleted node doesn't exist.
			else if(root.right == null)
				root = root.left;
			
			// When both child of deleted node exist.
			else {
				BSTNode successorOfRoot = findSuccessor(root.right);
				successorOfRoot.right = root.right;
				successorOfRoot.left = root.left;
				return successorOfRoot;
			}
		}
		return root;
	}

	@Override
	public boolean sort() {
		return false;
	}

	@Override
	public Map<Integer, String> sorted(int k1, int k2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public BSTNode findSuccessor(BSTNode root) {
		if(root.left != null)
			findSuccessor(root.left);
		return root;
	}

	private boolean isLeftOfRoot() {
		if(flag == 1)
			return true;
		
		return false;
	}
}
