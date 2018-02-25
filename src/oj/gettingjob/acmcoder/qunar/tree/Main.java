package oj.gettingjob.acmcoder.qunar.tree;

import java.util.LinkedList;
import java.util.Scanner;
/**
去哪儿2017校园招聘 软件开发工程师 在线考试
编程题 | 30分 1/3
按层打印二叉树    
时间限制：C/C++语言 2000MS；其他语言 4000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
给定一棵二叉树的前序（根、左、右）和中序（左、根、右）的打印结果，输出此二叉树按层（从左往右）打印结果。
例如一棵二叉树前序：1 2 4 5 3；中序：4 2 5 1 3。可以构建出下图所示二叉树：


按层打印的结果则为：1 2 3 4 5。

输入
第一行只有一个数字，表示二叉树的节点数n（1<=n<=1000）;
第二行由a1,a2,...,an(1<=ai<=1000)组成的整数序列（用空格分隔）—表示前序打印结果；
第三行由b1,b2,...,bn(1<=bi<=1000)组成的整数序列（用空格分隔）—表示中序打印结果。

输出
c1,c2,...,cn，用空格分隔—表示按层打印的结果。


样例输入
5
1 2 4 5 3
4 2 5 1 3

样例输出
1 2 3 4 5


温馨提示
请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果 
点击“调试”亦可保存代码
编程题可以使用本地编译器，此页面不记录跳出次数
 * @author Dan
 *
 */
public class Main {
	DataNode rootNode;
    DataNode tempNode;
    DataNode left_childDataNode;
    DataNode right_childDataNode;
    
    public DataNode initRootNode(int[] preArray){
        rootNode = new DataNode();
        rootNode.data = preArray[0];
        return rootNode;
    }
    
    public void buildTree(int[] preArray,int[] midArray,DataNode rootNode){
        int index_root = getIndex(midArray, rootNode.data);
        int lengthOfRightTree = preArray.length - index_root -1;
        
        int[] preArray_left;
        int[] preArray_right;
        int[] midArray_left;
        int[] midArray_right;
        
        if (index_root>0) {
            left_childDataNode = new DataNode();
            if (index_root==1) {
                left_childDataNode.data = midArray[0];
                rootNode.leftChild = left_childDataNode;
            }else {
                preArray_left = new int[index_root];
                midArray_left = new int[index_root];
                System.arraycopy(preArray, 1, preArray_left, 0, index_root);
                System.arraycopy(midArray, 0, midArray_left, 0, index_root);
                left_childDataNode.data = preArray_left[0];
                rootNode.leftChild = left_childDataNode;
                buildTree(preArray_left, midArray_left, left_childDataNode);
            }    
        }
        
        if (lengthOfRightTree>0) {
            right_childDataNode = new DataNode();
            if (lengthOfRightTree==1) {
                right_childDataNode.data = midArray[index_root+1];
                rootNode.rightChild = right_childDataNode;
                return;
            }else {
                preArray_right  = new int[lengthOfRightTree];
                midArray_right = new int[lengthOfRightTree];
                System.arraycopy(preArray, index_root+1, preArray_right, 0,lengthOfRightTree);
                System.arraycopy(midArray, index_root+1, midArray_right, 0, lengthOfRightTree);
                right_childDataNode.data = preArray_right[0];
                rootNode.rightChild = right_childDataNode;
                buildTree(preArray_right, midArray_right,right_childDataNode);
            }
        }
    }
    
    public int getIndex(int[] array,int temp){
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==temp) {
                index = i;
                return index;
            }
        }
        return index;
    }
/*    //后序遍历
    public void postOrderTraverse(DataNode node){
        if (node==null) {
            return;
        }
        postOrderTraverse(node.leftChild);
        postOrderTraverse(node.rightChild);
        System.out.print(node.data);
    }
    //前序遍历
    public void preOrderTraverse(DataNode node){
        if (node==null) {
            return;
        }
        System.out.print(node.data);
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }
    //中序遍历
    public void inOrderTraverse(DataNode node){
        if (node==null) {
            return;
        }
        inOrderTraverse(node.leftChild);
        System.out.print(node.data);
        inOrderTraverse(node.rightChild);
    }*/
	public void levelIterator(DataNode root) {
		if (root == null) {
			return;
		}
		LinkedList<DataNode> queue = new LinkedList<DataNode>();
		DataNode current = null;
		queue.offer(root);// 将根节点入队
		while (!queue.isEmpty()) {
			current = queue.poll();// 出队队头元素并访问
			System.out.print(current.data + " ");
			if (current.leftChild != null)// 如果当前节点的左节点不为空入队
			{
				queue.offer(current.leftChild);
			}
			if (current.rightChild != null)// 如果当前节点的右节点不为空，把右节点入队
			{
				queue.offer(current.rightChild);
			}
		}

	} 
    
    public static void main(String args[]){
        int[] preArray = null;
        int[] midArray = null;
        Main tree = new Main();
        DataNode headNode = null;
        //tree.buildTree(preArray, midArray, headNode);
        //tree.postOrderTraverse(headNode);
        //tree.levelIterator(headNode);
        Scanner cin = new Scanner(System.in);
        int n = 0;
        while (cin.hasNext()) {
        	n = cin.nextInt();
        	preArray = new int[n];
        	midArray = new int[n];
        	for (int i = 0; i < n; i++) 
        		preArray[i] = cin.nextInt();
        	for (int i = 0; i < n; i++) 
        		midArray[i] = cin.nextInt();
        	headNode = tree.initRootNode(preArray);
        	tree.buildTree(preArray, midArray, headNode);
        	tree.levelIterator(headNode);
        }
        cin.close();
    }
}
class DataNode{
    int data;
    DataNode leftChild = null;
    DataNode rightChild = null;
}