package datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
		// 只给出带空孩子的中序遍历序列无法确定一颗二叉树
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
			System.out.println("只给出带空孩子信息的中序遍历序列无法唯一确定一颗二叉树！");
			return null;
		}
	}

	public void preOrderTravel(TreeNode root) {
		if (root == null) {
			System.out.println("二叉树为空，无法遍历！");
			return;
		}
		System.out.print(root.val);
		if (root.left != null) {
			preOrderTravel(root.left);
		} else
			System.out.print("#");
		if (root.right != null) {
			preOrderTravel(root.right);
		} else
			System.out.print("#");
	}

	/**
	 * 非递归先序遍历二叉树
	 */
	public void preorderTraversal(TreeNode root) {
		// List<Integer> resultList=new ArrayList<>();
		Stack<TreeNode> treeStack = new Stack<>();
		if (root == null) // 如果为空树则返回
			return;
		treeStack.push(root);
		while (!treeStack.isEmpty()) {
			TreeNode tempNode = treeStack.pop();
			if (tempNode != null) {
				System.out.print(tempNode.val);// 访问根节点
				treeStack.push(tempNode.right); // 入栈右孩子
				treeStack.push(tempNode.left);// 入栈左孩子
			}
		}
		// return resultList;
	}

	public void inOrderTravel(TreeNode root) {
		if (root == null) {
			System.out.println("二叉树为空，无法遍历！");
			return;
		}
		if (root.left != null) {
			inOrderTravel(root.left);
		} else
			System.out.print("#");
		System.out.print(root.val);
		if (root.right != null) {
			inOrderTravel(root.right);
		} else
			System.out.print("#");
	}

	public void postOrderTravel(TreeNode root) {
		if (root == null) {
			System.out.println("二叉树为空，无法遍历！");
			return;
		}
		if (root.left != null) {
			postOrderTravel(root.left);
		} else
			System.out.print("#");
		if (root.right != null) {
			postOrderTravel(root.right);
		} else
			System.out.print("#");
		System.out.print(root.val);
	}

	public void levelTravel(TreeNode root) {
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode current;
		queue.offer(root);// 将根节点入队
		while (!queue.isEmpty()) {
			current = queue.poll();// 出队队头元素并访问
			System.out.print(current.val);
			if (current.left != null) { // 如果当前节点的左节点不为空入队
				queue.offer(current.left);
			}
			if (current.right != null) {// 如果当前节点的右节点不为空入队
				queue.offer(current.right);
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		String preStr = "124##5##36##7##";
		String inStr = "#4#2#5#1#6#3#7#";
		String postStr = "##4##52##6##731";
		TreeNode root = bt.create(preStr, "pre");
		System.out.println("先序遍历");
		bt.preOrderTravel(root);
		System.out.println("\n中序遍历");
		bt.inOrderTravel(root);
		System.out.println("\n后序遍历");
		bt.postOrderTravel(root);
		System.out.println("\n层次遍历");
		bt.levelTravel(root);
	}
}
