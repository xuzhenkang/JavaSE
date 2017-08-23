package datastructure.tree;

public class BinarySortTree {
	private TreeNode root;

	class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public BinarySortTree() {
		this.root = null;
	}

	public void buildTree(TreeNode node, int data) {
		if (root == null) {
			root = new TreeNode(data);
		} else {// ´´½¨¶þ²æÅÅÐòÊ÷
			if (data < node.val) {
				if (node.left == null) {
					node.left = new TreeNode(data);
				} else {
					buildTree(node.left, data);
				}
			} else {
				if (node.right == null) {
					node.right = new TreeNode(data);
				} else {
					buildTree(node.right, data);
				}
			}
		}
	}

	public void preOrder(TreeNode node) {
		if (node != null) {
			System.out.print(node.val + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	public void inOrder(TreeNode node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.val + " ");
			inOrder(node.right);
		}
	}
	public void postOrder(TreeNode node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.val + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 12, 45, 21, 6, 111 };
		BinarySortTree bTree = new BinarySortTree();
		for (int i = 0; i < a.length; i++) {
			bTree.buildTree(bTree.root, a[i]);
		}
		bTree.preOrder(bTree.root);
		System.out.println();
		bTree.inOrder(bTree.root);
		System.out.println();
		bTree.postOrder(bTree.root);
		System.out.println();
	}
}

// 1 2 3
