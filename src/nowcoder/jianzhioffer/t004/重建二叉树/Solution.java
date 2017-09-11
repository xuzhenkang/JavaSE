package nowcoder.jianzhioffer.t004.重建二叉树;

/**
 * 题目描述 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * @author Dan
 *
 */
public class Solution {
	public void display(TreeNode tn) {
		if (tn != null) {
			System.out.print(tn.val + " ");
			display(tn.left);
			display(tn.right);
		}
	}
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		Solution solution = new Solution();
		System.out.println(getLeftNum(1, in));
//		TreeNode tn = solution.reConstructBinaryTree(pre, in);
//		solution.display(tn);
		
	}
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return binaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}
	
	public TreeNode binaryTree(int[] pre, int pLeft, int pRight, int[] in, int iLeft, int iRight) {
		TreeNode tn = null;
		if (pre != null && pLeft < pre.length) {
			tn = new TreeNode(pre[pLeft]);
			int leftNum = getLeftNum(pre[pLeft], in);
			tn.left = binaryTree(pre, pLeft+1, leftNum-1,  in, iLeft, leftNum-1);
			tn.right = binaryTree(pre, leftNum+1, pRight, in, leftNum+1, iRight);
		}
		return tn;
	}
	
	public static int getLeftNum(int head, int[] in) {
		boolean flag = false;
		int i = 0;
		for (i = 0; i < in.length; i++) {
			if (in[i] == head) {
				flag = true;
				return i;
			}
		}
		if (!flag) return -1;
		else return i;
	}

}
