package datastructure.tree;

public class BinaryTree {
	private int pointer = 0;

	public class TreeNode {
		private char val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(char val) {
			this.val = val;
		}

		public TreeNode() {
		}
	}

	public TreeNode preCreate(String datas) {
		TreeNode root = null;
		char c = datas.charAt(pointer);
		if (c != '#') {
			root = new TreeNode(c);
			pointer++;
			root.left = preCreate(datas);
			pointer++;
			root.right = preCreate(datas);
		}
		return root;
	}

	public TreeNode inCreate(String datas) {
		// ֻ�������պ��ӵ�������������޷�ȷ��һ�Ŷ�����
		return null;
	}

	public TreeNode postCreate(String datas) {
		TreeNode root = null;
		char c = datas.charAt(pointer);
		if (c != '#') {
			root = new TreeNode(c);
			pointer--;
			root.right = postCreate(datas);
			pointer--;
			root.left = postCreate(datas);
		}
		return root;
	}

	public TreeNode create(String datas, String msg) {
		if (msg.equals("post")) {
			this.pointer = datas.length() - 1;
			return this.postCreate(datas);
		} else if (msg.equals("pre")) {
			this.pointer = 0;
			return this.preCreate(datas);
		} else {
			System.out.println("ֻ�������պ�����Ϣ��������������޷�Ψһȷ��һ�Ŷ�������");
			return null;
		}
	}

	public void preOrder(TreeNode root) {
		if (root == null) {
			System.out.println("������Ϊ�գ��޷�������");
			return;
		}
		System.out.print(root.val);
		if (root.left != null) {
			preOrder(root.left);
		} else
			System.out.print("#");
		if (root.right != null) {
			preOrder(root.right);
		} else
			System.out.print("#");
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			System.out.println("������Ϊ�գ��޷�������");
			return;
		}
		if (root.left != null) {
			inOrder(root.left);
		} else
			System.out.print("#");
		System.out.print(root.val);
		if (root.right != null) {
			inOrder(root.right);
		} else
			System.out.print("#");
	}

	public void postOrder(TreeNode root) {
		if (root == null) {
			System.out.println("������Ϊ�գ��޷�������");
			return;
		}
		if (root.left != null) {
			postOrder(root.left);
		} else
			System.out.print("#");
		if (root.right != null) {
			postOrder(root.right);
		} else
			System.out.print("#");
		System.out.print(root.val);
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		String preStr = "124##5##36##7##";
		String inStr = "#4#2#5#1#6#3#7#";
		String postStr = "##4##52##6##731";
		TreeNode root = bt.create(preStr, "pre");
		System.out.println("�������");
		bt.preOrder(root);
		System.out.println("\n�������");
		bt.inOrder(root);
		System.out.println("\n�������");
		bt.postOrder(root);
	}
}
