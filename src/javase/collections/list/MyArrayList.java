package javase.collections.list;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {
	private Object[] elem;
	private int initCapacity = 10;

	private int size = 0;

	public MyArrayList() {
		elem = new Object[initCapacity];
	}

	public MyArrayList(int initCapacity) {
		this.initCapacity = initCapacity;
		elem = new Object[initCapacity];
	}

	public boolean add(E o) {
		if (this.size + 1 > elem.length)
			Arrays.copyOf(elem, elem.length + elem.length >> 1); // 扩容
		System.out.println(size);
		elem[size++] = o;
		return true;
	}
	
	public boolean remove(E o) {
		if (o == null) {
            for (int index = 0; index < size; index++)
                if (elem[index] == null) {
                	System.arraycopy(elem, index + 1, elem, index, size - index - 1);
                	elem[--size] = null; // clear to let GC do its work
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(elem[index])) {
                	System.arraycopy(elem, index + 1, elem, index, size - index - 1);
                	elem[--size] = null; // clear to let GC do its work
                    return true;
                }
        }
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {

			private int cursor = -1;

			@Override
			public boolean hasNext() {
				return cursor + 1 < MyArrayList.this.size ? true : false;
			}

			@Override
			@SuppressWarnings("unchecked")
			public E next() {
				return hasNext() ? (E)elem[++cursor] : null;
			}
		};
	}

	public static void main(String[] args) {
		MyArrayList<String> ml = new MyArrayList<>();
		ml.add("a");
		ml.add("b");
		ml.add("c");
		ml.add("d");
		Iterator<String> iterator = ml.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		ml.remove("d");
		System.out.println("----------------------");
		for (Object s : ml) { // 实现了Iterable接口就可以使用增强for循环了
			System.out.println(s);
		}
	}
}
