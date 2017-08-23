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

	public void preOrderTravel(TreeNode root) {
		if (root == null) {
			System.out.println("������Ϊ�գ��޷�������");
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
	 * �ǵݹ��������������
	 */
	public void preorderTraversal(TreeNode root) {
		// List<Integer> resultList=new ArrayList<>();
		Stack<TreeNode> treeStack = new Stack<>();
		if (root == null) // ���Ϊ�����򷵻�
			return;
		treeStack.push(root);
		while (!treeStack.isEmpty()) {
			TreeNode tempNode = treeStack.pop();
			if (tempNode != null) {
				System.out.print(tempNode.val);// ���ʸ��ڵ�
				treeStack.push(tempNode.right); // ��ջ�Һ���
				treeStack.push(tempNode.left);// ��ջ����
			}
		}
		// return resultList;
	}

	public void inOrderTravel(TreeNode root) {
		if (root == null) {
			System.out.println("������Ϊ�գ��޷�������");
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
			System.out.println("������Ϊ�գ��޷�������");
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
		queue.offer(root);// �����ڵ����
		while (!queue.isEmpty()) {
			current = queue.poll();// ���Ӷ�ͷԪ�ز�����
			System.out.print(current.val);
			if (current.left != null) { // �����ǰ�ڵ����ڵ㲻Ϊ�����
				queue.offer(current.left);
			}
			if (current.right != null) {// �����ǰ�ڵ���ҽڵ㲻Ϊ�����
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
		System.out.println("�������");
		bt.preOrderTravel(root);
		System.out.println("\n�������");
		bt.inOrderTravel(root);
		System.out.println("\n�������");
		bt.postOrderTravel(root);
		System.out.println("\n��α���");
		bt.levelTravel(root);
	}
}
