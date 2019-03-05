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
		System.out.println("元素9在该顺序表中的下标为：" + sqlist.findIndexOf(9));	
	}
	@Test
	public void testInsert() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		if (sqlist.insert(4, 99)) {
			System.out.println(sqlist);
		} else {
			System.out.println("插入失败");
		}
	}
	@Test
	public void testDelete() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		if (sqlist.delete(3)) {
			System.out.println("删除成功\n删除后的序列为：" + sqlist);
		} else {
			System.out.println("删除失败");
		}
	}
	@Test
	public void testGetElem() {
		int data[] = {2, 5, 7, 9, 10};
		SequenceList sqlist = new SequenceList(data);
		System.out.println("第2个元素值为：" + sqlist.getElem(2));
	}
	
}
