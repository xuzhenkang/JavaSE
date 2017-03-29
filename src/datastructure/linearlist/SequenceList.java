package datastructure.linearlist;

/**
 * ˳���
 * @author kang
 *
 */
public class SequenceList {
	/**
	 * ��˳�����󳤶�
	 */
	private static int MAXSIZE = 100;
	/**
	 * ��˳��������
	 */
	private int data[] = new int[MAXSIZE];
	/**
	 * ��˳������Ч����
	 */
	private int length;
	
	
	/**
	 * ȷ��Ҫ�����λ��,����insertIntoOrderlySequenceList��������
	 * @param list
	 * @param x
	 * @return Ҫ�����λ��
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
	 * �������˳����в���һ��Ԫ��x���������Ϊ�ǵݼ����У������˳�����Ȼ��������
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
	 * ��Ԫ��ֵ�����㷨����˳����в��ҵ�һ��ֵ����e��Ԫ�أ��������±ꡣ
	 * @param e
	 * @return ������ڵ�һ������e��ֵ�򷵻��±꣬����������򷵻�-1��
	 */
	public int findIndexOf(int e) {
		for (int i = 0; i < this.length; i++) {
			if (this.data[i] == e) 
				return i;
		}
		return -1;
	}
	
	/**
	 * ��˳���L�ĵ�p(0<=locate<=length-1)��λ���ϲ����µ�Ԫ��e�����locate�����벻��ȷ������false���������ʧ�ܣ�
		���p��������ȷ����˳����locate��Ԫ���Լ��Ժ��Ԫ������һ��λ�ã��ڳ�һ���ռ������Ԫ�أ�˳����ȼ�1.
		����ɹ�������true.
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
	 * ɾ��˳������±�Ϊlocate(0<=locate<=length-1)��Ԫ��
	 * @param locate �±�
	 * @return �ɹ�����true�����򷵻�false��
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
	 * ��ָ��λ��Ԫ�ص��㷨,���ظ�˳�����locate(0<=locate<=length-1)λ���ϵ�Ԫ�ء�
	 */
	public int getElem(int locate) {
		if (locate < 0 || locate > this.length - 1) {
			System.exit(-1);
		}
		return this.data[locate]; 
	}
	
	
	/**
	 * �޲ι��췽��
	 */
	public SequenceList() {
	}
	/**
	 * ���췽��
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
