package datastructure.linearlist;

import org.junit.Test;

public class SequenceListTest {
	
	@Test
	public void testInsertIntoOrderlySequenceList() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		sqlist.insertIntoOrderlySequenceList(8);
		System.out.println(sqlist);
	}
	@Test
	public void testFindIndexOf() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		System.out.println("Ԫ��9�ڸ�˳����е��±�Ϊ��" + sqlist.findIndexOf(9));	
	}
	@Test
	public void testInsert() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		if (sqlist.insert(4, 99)) {
			System.out.println(sqlist);
		} else {
			System.out.println("����ʧ��");
		}
	}
	@Test
	public void testDelete() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		if (sqlist.delete(3)) {
			System.out.println("ɾ���ɹ�\nɾ���������Ϊ��" + sqlist);
		} else {
			System.out.println("ɾ��ʧ��");
		}
	}
	@Test
	public void testGetElem() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		System.out.println("��2��Ԫ��ֵΪ��" + sqlist.getElem(2));
	}
	
}
