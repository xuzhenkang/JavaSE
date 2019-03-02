package datastructure.sort;

public class SelectSorting extends Sorting {
	/**
	 * <h4>选择排序</h4>
	 * 
	 * <p>
	 * 复杂度分析：<br/>
	 * <ul>
	 * <li>基本操作执行次数：n(n-1)/2,时间复杂度为O(n^2)</li>
	 * <li>空间复杂度为O(1)</li>
	 * </ul>
	 * </p>
	 * 
	 * @param arr
	 */
	public static void simpleSelectSort(int[] arr) {
		int i, j, minIndex, t; // minIndex是最小元素的下标
		for (i = 0; i < arr.length; i++) {
			minIndex = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			t = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = t;
		}
	}

	/**
	 * <h4>堆排序</h4>
	 * 
	 * <h5>复杂度分析</h5>
	 * <h6>时间复杂度</h6>
	 * <p>
	 * 对于sift()函数,
	 * 显然j走了一条从当前节点到叶子节点的路径，完全二叉树的高度为log_2(n+1)向上取整，即每个节点调整的时间复杂度为O(log_2n)。
	 * </p>
	 * <p>
	 * 对于heapSort()函数，基本操作总次数应该是两个并列的for循环中基本操作次数相加，第一个循环的基本操作次数为O(log_2n)*n/2，第二个循环基本操作次数为O(log_2n)*(n-1)，因此，整个算法的基本操作次数为O(log_2n)*n/2+O(log_2n)*(n-1),化简得O(nlog_2n)。
	 * </p>
	 * <h6>空间复杂度</h6>
	 * <p>
	 * 空间复杂度为O(1)。
	 * </p>
	 * <h5>应用说明</h5>
	 * <p>
	 * 堆排序适合的场景是记录很多的情况，典型的例子是从10 000个记录中选出10个最小 的，这种情况用堆排序最好。如果记录数较少，则不提倡使用堆排序。
	 * </p>
	 * 
	 * @param arr
	 */
	public static void heapSort(int[] arr) {
		/* i = arr.length / 2 - 1表示从最后一个非叶结点开始，依次向前调整， 全部非叶结点都调整好后，就建成了一个堆。 */
		for (int i = arr.length / 2 - 1; i >= 0; i--) { // 创建堆
			/*
			 * 注意：Java的数组是从0开始的，对于完全二叉树的数组存储的数据结构来说，最后一个非叶结点的索引是 arr.length / 2
			 * - 1
			 */
			sift(arr, i, arr.length - 1); // 调整的i位置处的节点，调整后，其连带的子节点若不满足定义，也会自动调整。
		}
		/* */
		for (int i = arr.length - 1; i >= 1; i--) {
			/*
			 * 下面三句是将堆的第0个元素(即根节点)与数组中第i个位置的节点交换。数组从i开始到最后都是有序部分，从0开始到i之前(不含i)，
			 * 是无序部分，也是堆部分。
			 */
			int t = arr[0];
			arr[0] = arr[i];
			arr[i] = t;
			/*
			 * 因为交换后，原来的数组无序元素中最后一个元素(假设为b),
			 * 与堆得第一个元素(根节点，也是数组的第0个元素)交换后，b跑到堆得根部了，
			 * 此时堆中 唯一可能不满足堆的定义的节点只有b。因此，此处只调整根节点
			 */
			sift(arr, 0, i - 1);
		}
	}
	/**
	 * 调整数组arr中low处的节点。数组arr从low处到high处构成一个堆。
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void sift(int[] arr, int low, int high) {
		/* Java的数组是从0开始的，对于完全二叉树的数组存储的数据结构来说，这里i是父节点在数组中的索引，j是i的左儿子节点在数组中的索引 */
		int i = low, j = 2 * (i + 1) - 1; // i是父节点在数组中的索引，j是左儿子节点在数组中的索引。
		int t = arr[low]; // low是要调整的位置，用t记录该值,t是父节点的值
		while (j <= high) { // 若i有左儿子和右儿子，或i只有左儿子，则执行循环
			if (j < high && arr[j] < arr[j + 1]) // 若i有左儿子和右儿子，并且左儿子的值比右儿子的值小，则j指向右儿子。j指向的是i的较大的孩子。
				j++;
			if (t < arr[j]) { // 若父节点比它的较大孩子的值小
				arr[i] = arr[j]; // 将父节点的较大孩子的值赋值给该父节点
				/* 为了继续向下调整，要更新i和j的指向 */
				i = j; // 更新i，令i指向刚刚调整过的孩子节点上
				j = 2 * (i + 1) - 1; // j指向i的左儿子节点
			} else // 若父节点不小于它较大的孩子节点，则调整结束
				break; 
		}
		arr[i] = t; // 被调整节点的值放入最终位置。
	}
}
