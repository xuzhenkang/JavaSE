package datastructure.tree;

import java.util.LinkedList;
import java.util.Stack;

import datastructure.tree.BinaryTree.TreeNode;

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

	/**
	 * 利用先序序列（带有空孩子信息）创建二叉树
	 * 
	 * @param datas
	 * @return
	 */
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

	/**
	 * 只利用中序序列（带有空孩子信息）无法唯一确定一颗二叉树，因此该函数无法实现
	 * 
	 * @param datas
	 * @return
	 */
	public TreeNode inCreate(String datas) {
		// 只给出带空孩子的中序遍历序列无法确定一颗二叉树
		return null;
	}

	/**
	 * 利用后续序列（带有空孩子信息）创建二叉树
	 * 
	 * @param datas
	 * @return
	 */
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

	/**
	 * 创建二叉树
	 * 
	 * @param datas
	 * @param msg
	 * @return
	 */
	public TreeNode create(String datas, String msg) {
		if (msg.equals("pre")) {
			this.pointer = 0;
			return this.preCreate(datas);
		} else if (msg.equals("in")) {
			System.out.println("只给出带空孩子信息的中序遍历序列无法唯一确定一颗二叉树！");
			return null;
		} else if (msg.equals("post")) {
			this.pointer = datas.length() - 1;
			return this.postCreate(datas);
		} else if (msg.equals("pre&in")) {
			return null;
		} else {
			return null;
		}
	}

	/**
	 * 递归先序遍历
	 * 
	 * @param root
	 */
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
	 * 递归中序遍历
	 * 
	 * @param root
	 */
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

	/**
	 * 递归后序遍历
	 * 
	 * @param root
	 */
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

	/**
	 * 层次遍历
	 * 
	 * @param root
	 */
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

	/**
	 * 非递归先序遍历二叉树方法1
	 */
	public void preOrderTravelNonRecurI(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (root != null | !s.empty()) {
			while (root != null) {
				System.out.print(root.val);
				s.add(root);
				root = root.left;
			}
			if (root == null)
				System.out.print("#");
			root = s.pop();
			root = root.right;
		}
		if (root == null)
			System.out.print("#");
	}

	/**
	 * 非递归先序遍历二叉树方法2
	 * 
	 * @param root
	 */
	public void preOrderTravelNonRecurII(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);
		while (!stack.empty()) {
			TreeNode t = stack.pop();
			System.out.print(t.val);
			if (t.right != null)
				stack.add(t.right);
			else
				System.out.print("#");
			if (t.left != null)
				stack.add(t.left);
			else
				System.out.print("#");
		}
	}

	/**
	 * 非递归中序遍历
	 * 
	 * @param root
	 */
	public void inOrderTravelNonRecur(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		TreeNode currentNode = root, tmp;
		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {// 先"走完"左孩子
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			if (currentNode == null)
				System.out.print("#");
			if (!stack.isEmpty()) {// 结点没有左孩子了,出栈,访问结点
				tmp = stack.pop();
				System.out.print(tmp.val);// visit
				currentNode = tmp.right;
			}
		}
		if (currentNode == null) 
			System.out.print("#");
	}

	/**
	 * 非递归后序遍历方法1
	 * 因为后序序列是对称树的先序序列，因此有如下方法
	 * @param n
	 */
	public void postOrderTravelNonRecurI(TreeNode n) {
		Stack<TreeNode> stack = new Stack<>();
		Stack<TreeNode> resultStack = new Stack<>();
		stack.push(n);
		while (!stack.empty()) {
			TreeNode t = stack.pop();
			resultStack.push(t);
			if (t.left != null)
				stack.push(t.left);
			if (t.right != null)
				stack.push(t.right);
		}
		while (!resultStack.empty()) {
			System.out.print(resultStack.pop().val);
		}
	}
	/**
	 * 非递归后序遍历方法2
	 * @param n
	 */
	public void postOrderTravelNonRecurII(TreeNode n) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int[] flag = new int[10];
		while (n != null) {
			stack.push(n);
			flag[stack.size()] = 0;
			n = n.left;
		}
		while (!stack.empty()) {
			n = stack.peek();
			while (n.right != null && flag[stack.size()] == 0) {
				n = n.right;
				flag[stack.size()] = 1;
				while (n != null) {
					stack.push(n);
					flag[stack.size()] = 0;
					n = n.left;
				}
				n = stack.peek();
			}
			n = stack.pop();
			System.out.print(n.val);
		}
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		String preStr = "124##5##36##7##";
		String inStr = "#4#2#5#1#6#3#7#";
		String postStr = "##4##52##6##731";
		TreeNode root = bt.create(preStr, "pre");
		System.out.println("递归先序遍历");
		bt.preOrderTravel(root);
		System.out.println("\n递归中序遍历");
		bt.inOrderTravel(root);
		System.out.println("\n递归后序遍历");
		bt.postOrderTravel(root);
		System.out.println("\n层次遍历");
		bt.levelTravel(root);
		System.out.println("\n非递归先序遍历方法I");
		bt.preOrderTravelNonRecurI(root);
		System.out.println("\n非递归先序遍历方法II");
		bt.preOrderTravelNonRecurII(root);
		System.out.println("\n非递归中序遍历");
		bt.inOrderTravelNonRecur(root);
		System.out.println("\n非递归后序遍历方法I");
		bt.postOrderTravelNonRecurI(root);
		System.out.println("\n非递归后序遍历方法II");
		bt.postOrderTravelNonRecurII(root);
	}
}
