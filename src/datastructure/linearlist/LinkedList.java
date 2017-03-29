package datastructure.linearlist;

/**
 * ע�⣬��LinkedList��jdk�е�LinkedList�ǲ�ͬ�ģ� ��LinkedListֻΪ�˽�����������ݽṹ��
 * 
 * @author kang
 *
 */
public class LinkedList {
	/**
	 * ������
	 */
	private int data;
	/**
	 * ָ����
	 */
	private LinkedList next = null;

	/**
	 * �Ƿ��ͷ���
	 */
	private boolean withHead = true;

	/**
	 * ��������a����n��Ԫ�ء�β�巨��������(����ͷ���)
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
	 * ����һ������ͷ������������β�巨
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
	 * ����ͷ����������ʹ��ͷ�巨
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
	 * A��B��������������ͷ��㣩������Ԫ�ص����������һ���㷨 ��A��B�鲢��һ����Ԫ��ֵ�ѵݼ����������C��C��A��B�еĽ����ɡ�
	 */

	
	
	
	
	
	
	
	private LinkedList() {
		
	}
	/**
	 * 
	 * @param a ����
	 * @param withHead �Ƿ����ͷ���
	 * @param isTailInsert �Ƿ�Ϊβ�巨��������(true�������β�巨������false�������ͷ�巨����)
	 * @throws HeadInsertNoHeadLinkedListException 
	 */
	public LinkedList(int[] a, boolean withHead, boolean isTailInsert) throws HeadInsertNoHeadLinkedListException {
		this.withHead = withHead;
		// ����ͷ����޷�����ͷ�巨
		if (!withHead && !isTailInsert) {
			throw new HeadInsertNoHeadLinkedListException();
		} else if (!withHead && isTailInsert) {
			this.createNoHeadListR(a);// ���ò���ͷ����β�巨
		} else if (withHead && isTailInsert) {
			this.createListR(a); // ���ô�ͷ����β�巨
		} else  {
			this.createListF(a);// ���ô�ͷ����ͷ�巨
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

	// �������Ƿ��д���ͷ��������
	public boolean isWithHead() {
		return withHead;
	}
	
	class HeadInsertNoHeadLinkedListException extends Exception {

		private static final long serialVersionUID = 1L;

		public HeadInsertNoHeadLinkedListException() {
			super("����ͷ����޷�����ͷ�巨��");
		}
	}
}
