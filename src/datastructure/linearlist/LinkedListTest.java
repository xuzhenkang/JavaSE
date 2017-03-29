package datastructure.linearlist;

import org.junit.Test;

import datastructure.linearlist.LinkedList.HeadInsertNoHeadLinkedListException;

public class LinkedListTest {
	@Test
	public void testCreateListR() throws HeadInsertNoHeadLinkedListException {
		int[] a = {2, 4, 5, 8, 10, 13};
		LinkedList list = new LinkedList(a, true, true);
		System.out.println(list);
	}
	
}
