package acmcoder.dcits.problem1;

import java.util.Scanner;

public class Main {
	public static void quickSort(int[] arr, int left, int right) {
		int temp, i = left, j = right;
		if (left < right) {
			temp = arr[left];
			while (i != j) {
				while (j > i && arr[j] > temp)
					j--;
				if (i < j) {
					arr[i] = arr[j];
					i++;
				}
				while (i < j && arr[i] < temp)
					i++;
				if (i < j) {
					arr[j] = arr[i];
					j--;
				}
			}
			arr[i] = temp;
			quickSort(arr, left, i - 1);
			quickSort(arr, i + 1, right);
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String[] nums = cin.nextLine().split(",");
			int[] input = new int[nums.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(nums[i]);
			}
			quickSort(input, 0, input.length-1);
			for (int i = 0; i < input.length; i++) {
				System.out.print(input[i] + " ");
			}
		}
		cin.close();
	}
}
