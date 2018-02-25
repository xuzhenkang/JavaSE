package oj.gettingjob.nowcoder.jianzhioffer.t003.从尾到头打印链表;

import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> result = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode != null) {
			printListFromTailToHead(listNode.next);
            result.add(listNode.val);
			//System.out.print(listNode.val);
		}
		return this.result;
	}
}