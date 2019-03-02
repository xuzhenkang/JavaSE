package datastructure.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <h4>最近最少使用缓存的回收（LRU）</h4>
 * 
 * <p>
 * 怎么实现一个最近最少使用（LRU）的缓存。缓存可以通过哈希表来实现，然而为这个缓存增加大小限制会变成另一个有意思的问题。<br/>
 * 为了实现缓存回收，我们需要很容易做到：
 * </p>
 * <ul>
 * <ol>
 * 1.查询出最近最晚使用的项
 * </ol>
 * <ol>
 * 2.给最近使用的项做一个标记
 * </ol>
 * </ul>
 * <p>
 * 链表可以实现这两个操作，<b>检测最近最少使用的项只需要返回链表的尾部。标记一项为最近使用的项只需要从当前位置移除，然后将该项放置到头部。</b>
 * 比较困难的事情是怎么<b>快速</b>的在链表中找到该项。
 * </p>
 * <h4>哈希表的帮助</h4>
 * <p>
 * 看一下我们工具箱中的数据结构，哈希表可以在(消耗)常量的时间内索引到某个对象。如果我们创建一个形如Key-链表结点的哈希表，我们就能够在常量时间内找到最近使用的结点。
 * 更甚的是，我们也能够在常量时间内判断结点是否存在（或不存在）；找到这个结点后，我们就能将这个结点移动到链表的最前端，标记为最近使用的项了。
 * </p>
 * <h4>Java的捷径</h4>
 * <p>
 * 据我所知，很少有一种编程语言的标准库中有通用的数据结构能提供上述功能。这是一种混合的数据结构，我们需要在哈希表的基础上建立一个链表。
 * 但是Java已经为我们提供了这种形式的数据结构LinkedHashMap！它甚至提供可覆盖回收策略的方法（见removeEldestEntry的文档）。
 * 唯一需要我们注意的事情是，该链表的顺序是插入的顺序，而不是访问的顺序。但是，有一个构造函数提供了一个选项，可以使用访问的顺序。
 * <br/>
 * 该方法是最简便的实现方法。
 * </p>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private static final long serialVersionUID = 1L;
	private int cacheSize;

	public LRUCache(int cacheSize) {
		super(16, 0.75f, true);
		this.cacheSize = cacheSize;
	}

	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() >= cacheSize;
	}
}
