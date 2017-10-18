package datastructure.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * ������һ��ʵ�ַ�������΢���ӡ�
 * @author lenovo
 *
 */
public class LRUCache2 {
	/*˫������*/
	class Node {
		Node pre;
		Node next;
		Integer key;
		Integer val;
		Node(Integer k, Integer v) {
			key = k;
			val = v;
		}
	}
	
	Map<Integer, Node> map = new HashMap<>();
	Node head; // head������������ϵĽڵ�
	Node tail; // tail�������������Ľڵ�
	int cap;
	public LRUCache2(int capacity) {
		cap = capacity;
		head = new Node(null, null);
		tail = new Node(null, null);
		head.next = tail;
		tail.pre = head;
	}
	public int get(int key) {
		Node n = map.get(key);
		if (n != null) {
			// ��n��������ժ����
			n.pre.next = n.next;
			n.next.pre = n.pre;
			// ��n�ŵ������β��
			appendTail(n);
			return n.val;
		}
		return -1;
	}
	
	public void set(int key, int value) {
		Node n = map.get(key);
		if (n != null) {
			n.val = value;
			map.put(key, n);
			// ��n��������ժ����
			n.pre.next = n.next;
			n.next.pre = n.pre;
			// ��n�ŵ������β��
			appendTail(n);
			return;
		} 
		if (map.size() == cap) {
			Node tmp = head.next;
			// ��tmp��������ժ����
			head.next = head.next.next;
			head.next.pre = head;
			// ��tmpɾ��
			map.remove(tmp.key);
		}
		// nΪ�յ�ʱ��
		n = new Node(key, value);
		appendTail(n);
		map.put(key, n);
	}
	
	private void appendTail(Node n) {
		n.next = tail;
		n.pre = tail.pre;
		tail.pre.next = n;
		tail.pre = n;
	}
	
}

