package hihocoder.mstest2017.problem1;

public class Tree {
	private int p;
	private int q;
	private int n;
	private TreeNode root = null;
	
	public TreeNode getRoot() {
		return root;
	}
	public Tree(int p, int q, int n) {
		this.p = p;
		this.q = q;
		this.n = n;
		this.root = create(null, p, q, n, 0, 0);
	}
	public static void travel(TreeNode root) {
		if (root != null) {
			System.out.println(root);
			travel(root.left);
			travel(root.right);
		}
	}
	public TreeNode create(TreeNode parent, int p, int q, int n, int layer, int questNum) {
		TreeNode root = new TreeNode(parent, null, null, layer, questNum, p, q);
		if (root.questNum == n) return root;
		TreeNode left = create(root, p/2, q, n, layer+1, questNum+1);
		int leftp = q + p > 100 ? 100 : q + p;
		int leftq = 100 - leftp;
		TreeNode right = create(root, leftp, leftq, n, layer+1, questNum);
		root.left = left;
		root.right = right;
		return root;
	}
}
