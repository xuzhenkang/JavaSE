package io.file;

public class TestRecursion {
	public static int function(int n) {
		if (n < 0) return -1;
		else if (n == 0) return 1;
		else return n * function(n-1);
	}
	public static void main(String[] args) {
		System.out.println(function(-1)); 
	}
}
