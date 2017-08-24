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
	 * �����������У����пպ�����Ϣ������������
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
	 * ֻ�����������У����пպ�����Ϣ���޷�Ψһȷ��һ�Ŷ���������˸ú����޷�ʵ��
	 * 
	 * @param datas
	 * @return
	 */
	public TreeNode inCreate(String datas) {
		// ֻ�������պ��ӵ�������������޷�ȷ��һ�Ŷ�����
		return null;
	}

	/**
	 * ���ú������У����пպ�����Ϣ������������
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
	 * ����������
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
			System.out.println("ֻ�������պ�����Ϣ��������������޷�Ψһȷ��һ�Ŷ�������");
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
	 * �ݹ��������
	 * 
	 * @param root
	 */
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
	 * �ݹ��������
	 * 
	 * @param root
	 */
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

	/**
	 * �ݹ�������
	 * 
	 * @param root
	 */
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

	/**
	 * ��α���
	 * 
	 * @param root
	 */
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

	/**
	 * �ǵݹ������������������1
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
	 * �ǵݹ������������������2
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
	 * �ǵݹ��������
	 * 
	 * @param root
	 */
	public void inOrderTravelNonRecur(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		TreeNode currentNode = root, tmp;
		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {// ��"����"����
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			if (currentNode == null)
				System.out.print("#");
			if (!stack.isEmpty()) {// ���û��������,��ջ,���ʽ��
				tmp = stack.pop();
				System.out.print(tmp.val);// visit
				currentNode = tmp.right;
			}
		}
		if (currentNode == null) 
			System.out.print("#");
	}

	/**
	 * �ǵݹ�����������1
	 * ��Ϊ���������ǶԳ������������У���������·���
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
	 * �ǵݹ�����������2
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
		System.out.println("�ݹ��������");
		bt.preOrderTravel(root);
		System.out.println("\n�ݹ��������");
		bt.inOrderTravel(root);
		System.out.println("\n�ݹ�������");
		bt.postOrderTravel(root);
		System.out.println("\n��α���");
		bt.levelTravel(root);
		System.out.println("\n�ǵݹ������������I");
		bt.preOrderTravelNonRecurI(root);
		System.out.println("\n�ǵݹ������������II");
		bt.preOrderTravelNonRecurII(root);
		System.out.println("\n�ǵݹ��������");
		bt.inOrderTravelNonRecur(root);
		System.out.println("\n�ǵݹ�����������I");
		bt.postOrderTravelNonRecurI(root);
		System.out.println("\n�ǵݹ�����������II");
		bt.postOrderTravelNonRecurII(root);
	}
}
