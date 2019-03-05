package datastructure.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * 这是另一种实现方法。略微复杂。
 * @author lenovo
 *
 */
public class LRUCache2 {
	/*双向链表*/
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
	Node head; // head是链表的最年老的节点
	Node tail; // tail是链表的最年轻的节点
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
			// 把n从链表中摘下来
			n.pre.next = n.next;
			n.next.pre = n.pre;
			// 把n放到链表的尾部
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
			// 把n从链表中摘下来
			n.pre.next = n.next;
			n.next.pre = n.pre;
			// 把n放到链表的尾部
			appendTail(n);
			return;
		} 
		if (map.size() == cap) {
			Node tmp = head.next;
			// 把tmp从链表上摘下来
			head.next = head.next.next;
			head.next.pre = head;
			// 把tmp删掉
			map.remove(tmp.key);
		}
		// n为空的时候
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

