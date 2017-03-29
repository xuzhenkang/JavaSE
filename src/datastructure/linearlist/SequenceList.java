package datastructure.linearlist;

/**
 * 顺序表
 * @author kang
 *
 */
public class SequenceList {
	/**
	 * 该顺序表最大长度
	 */
	private static int MAXSIZE = 100;
	/**
	 * 该顺序表的数据
	 */
	private int data[] = new int[MAXSIZE];
	/**
	 * 该顺序表的有效长度
	 */
	private int length;
	
	
	/**
	 * 确定要插入的位置,仅供insertIntoOrderlySequenceList方法调用
	 * @param list
	 * @param x
	 * @return 要插入的位置
	 */
	private int locateElem(int x) {
		int index;
		for (index = 0; index < this.length; index++) {
			if (this.data[index] >= x) {
				return index;
			}
		}
		return index;
	}

	/**
	 * 向该有序顺序表中插入一个元素x，该有序表为非递减序列，插入后顺序表仍然递增有序。
	 * 
	 * @param x
	 */
	public void insertIntoOrderlySequenceList(int x) {
		int locate = locateElem(x), i;
		for (i = this.length - 1; i >= locate; i--) {
			this.data[i+1] = this.data[i];
		}
		this.data[locate] = x;
		this.length++;
	}
	
	
	/**
	 * 按元素值查找算法：在顺序表中查找第一个值等于e的元素，并返回下标。
	 * @param e
	 * @return 如果存在第一个等于e的值则返回下标，如果不存在则返回-1。
	 */
	public int findIndexOf(int e) {
		for (int i = 0; i < this.length; i++) {
			if (this.data[i] == e) 
				return i;
		}
		return -1;
	}
	
	/**
	 * 在顺序表L的第p(0<=locate<=length-1)个位置上插入新的元素e。如果locate的输入不正确，返回false，代表插入失败；
		如果p的输入正确，则将顺序表第locate个元素以及以后的元素右移一个位置，腾出一个空间插入新元素，顺序表长度加1.
		插入成功，返回true.
	 */
	public boolean insert(int locate, int x) {
		if (locate < 0 || locate > this.length-1) {
			return false;
		}
		int i;
		for (i = this.length - 1; i >= locate; i--) {
			this.data[i+1] = this.data[i];
		}
		this.data[locate] = x;
		this.length++;
		return true;
	}
	
	
	/**
	 * 删除顺序表中下标为locate(0<=locate<=length-1)的元素
	 * @param locate 下标
	 * @return 成功返回true，否则返回false。
	 */
	public boolean delete(int locate) {
		
		if (locate < 0 || locate > this.length-1)
			return false;
		
		for (int i = locate; i < this.length; i++) 
			this.data[i] = this.data[i+1];
		
		this.length--;
		return true;
	}
	
	/**
	 * 求指定位置元素的算法,返回该顺序表中locate(0<=locate<=length-1)位置上的元素。
	 */
	public int getElem(int locate) {
		if (locate < 0 || locate > this.length - 1) {
			System.exit(-1);
		}
		return this.data[locate]; 
	}
	
	
	/**
	 * 无参构造方法
	 */
	public SequenceList() {
	}
	/**
	 * 构造方法
	 * @param data
	 */
	public SequenceList(int[] data) {

		for (int i = 0; i < data.length; i++) {
			this.data[i] = data[i];
		}
		this.length = data.length;
	}
	
	
	
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < this.length-1; i++) {
			result += data[i] + ",";
		}
		return result + data[this.length-1];
	}
}
