package oj.gettingjob.acmcoder.qunar.tree;

import java.util.LinkedList;
import java.util.Scanner;
/**
ȥ�Ķ�2017У԰��Ƹ �����������ʦ ���߿���
����� | 30�� 1/3
�����ӡ������    
ʱ�����ƣ�C/C++���� 2000MS���������� 4000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
����һ�ö�������ǰ�򣨸������ң��������󡢸����ң��Ĵ�ӡ���������˶��������㣨�������ң���ӡ�����
����һ�ö�����ǰ��1 2 4 5 3������4 2 5 1 3�����Թ�������ͼ��ʾ��������


�����ӡ�Ľ����Ϊ��1 2 3 4 5��

����
��һ��ֻ��һ�����֣���ʾ�������Ľڵ���n��1<=n<=1000��;
�ڶ�����a1,a2,...,an(1<=ai<=1000)��ɵ��������У��ÿո�ָ�������ʾǰ���ӡ�����
��������b1,b2,...,bn(1<=bi<=1000)��ɵ��������У��ÿո�ָ�������ʾ�����ӡ�����

���
c1,c2,...,cn���ÿո�ָ�����ʾ�����ӡ�Ľ����


��������
5
1 2 4 5 3
4 2 5 1 3

�������
1 2 3 4 5


��ܰ��ʾ
�뾡����ȫ�����Խ���10����ǰ���Գ��򣬷��������ܼ��Ŷ��ύ�����ܲ�ѯ���������� 
��������ԡ���ɱ������
��������ʹ�ñ��ر���������ҳ�治��¼��������
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
/*    //�������
    public void postOrderTraverse(DataNode node){
        if (node==null) {
            return;
        }
        postOrderTraverse(node.leftChild);
        postOrderTraverse(node.rightChild);
        System.out.print(node.data);
    }
    //ǰ�����
    public void preOrderTraverse(DataNode node){
        if (node==null) {
            return;
        }
        System.out.print(node.data);
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }
    //�������
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
		queue.offer(root);// �����ڵ����
		while (!queue.isEmpty()) {
			current = queue.poll();// ���Ӷ�ͷԪ�ز�����
			System.out.print(current.data + " ");
			if (current.leftChild != null)// �����ǰ�ڵ����ڵ㲻Ϊ�����
			{
				queue.offer(current.leftChild);
			}
			if (current.rightChild != null)// �����ǰ�ڵ���ҽڵ㲻Ϊ�գ����ҽڵ����
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