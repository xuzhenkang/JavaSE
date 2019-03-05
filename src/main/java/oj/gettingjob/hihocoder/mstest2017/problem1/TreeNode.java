package oj.gettingjob.hihocoder.mstest2017.problem1;

public class TreeNode {
	TreeNode parent;
	TreeNode left;
	TreeNode right;
	int layer;
	int questNum;
	int leftP;
	int rightQ;

	public TreeNode() {
	}

	public TreeNode(TreeNode parent, TreeNode left, TreeNode right, int layer, int questNum, int leftP, int rightQ) {
		this.parent = parent;
		this.left = left;
		this.right = right;
		this.layer = layer;
		this.questNum = questNum;
		this.leftP = leftP;
		this.rightQ = rightQ;
	}

	@Override
	public String toString() {
		return "[parent=" + parent + ", layer=" + layer + ", questNum=" + ", leftP=" + leftP + ", rightQ=" + rightQ
				+ "]";
	}
}
