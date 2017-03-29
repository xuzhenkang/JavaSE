package datastructure.linearlist;

/**
 * 注意，此LinkedList与jdk中的LinkedList是不同的， 本LinkedList只为了解释链表的数据结构。
 * 
 * @author kang
 *
 */
public class LinkedList {
	/**
	 * 数据域
	 */
	private int data;
	/**
	 * 指针域
	 */
	private LinkedList next = null;

	/**
	 * 是否带头结点
	 */
	private boolean withHead = true;

	/**
	 * 假设数组a中有n个元素。尾插法创建链表。(不带头结点)
	 * 
	 * @param a
	 */
	private void createNoHeadListR(int[] a) {
		if (a.length < 1) {
			System.exit(-1);
		} else {
			LinkedList p = this;
			this.data = a[0];
			for (int i = 1; i < a.length; i++) {
				LinkedList list = new LinkedList();
				list.data = a[i];
				p.next = list;
				p = p.next;
			}
		}
	}

	/**
	 * 创建一个带有头结点的链表，采用尾插法
	 * @param a
	 */
	private void createListR(int[] a) {
		if (a.length < 1) {
			System.exit(-1);
		} else {
			LinkedList p = this;
			for (int i = 0; i < a.length; i++) {
				LinkedList list = new LinkedList();
				list.data = a[i];
				p.next = list;
				p = p.next;
			}
		}
	}

	/**
	 * 不带头结点的链表不能使用头插法
	 * 
	 * @param a
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private void createNoHeadListF(int[] a) {
	}
	
	private void createListF(int[] a) {
		if (a.length < 1) {
			System.exit(-1);
		} else {
			LinkedList p = this;
			for (int i = 0; i < a.length; i++) {
				LinkedList list = new LinkedList();
				list.data = a[i];
				p.next = list;
				p = p.next;
			}
		}
	}
	
	

	/**
	 * A和B是两个单链表（带头结点），其中元素递增有序，设计一个算法 将A和B归并成一个按元素值费递减有序的链表C，C由A和B中的结点组成。
	 */

	
	
	
	
	
	
	
	private LinkedList() {
		
	}
	/**
	 * 
	 * @param a 数组
	 * @param withHead 是否带有头结点
	 * @param isTailInsert 是否为尾插法创建链表(true代表采用尾插法创建，false代表采用头插法创建)
	 * @throws HeadInsertNoHeadLinkedListException 
	 */
	public LinkedList(int[] a, boolean withHead, boolean isTailInsert) throws HeadInsertNoHeadLinkedListException {
		this.withHead = withHead;
		// 不带头结点无法采用头插法
		if (!withHead && !isTailInsert) {
			throw new HeadInsertNoHeadLinkedListException();
		} else if (!withHead && isTailInsert) {
			this.createNoHeadListR(a);// 调用不带头结点的尾插法
		} else if (withHead && isTailInsert) {
			this.createListR(a); // 调用带头结点的尾插法
		} else  {
			this.createListF(a);// 调用带头结点的头插法
		} 
	}
	
	@Override
	public String toString() {
		String result = "";
		LinkedList p = null;
		if (!(this.withHead && this.next == null)) {
			p = this.withHead ? this.next : this;
			while (p.next != null) {
				result += p.data + ",";
				p = p.next;
			}
			result += p.data;
		} 
		return result;
	}

	// 该链表是否有带有头结点的链表
	public boolean isWithHead() {
		return withHead;
	}
	
	class HeadInsertNoHeadLinkedListException extends Exception {

		private static final long serialVersionUID = 1L;

		public HeadInsertNoHeadLinkedListException() {
			super("不带头结点无法采用头插法。");
		}
	}
}
