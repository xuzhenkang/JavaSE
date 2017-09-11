package acmcoder.sougou.distancebetweentwopoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static double f(double[] arr) {
		double min = arr[0];
		int j = arr.length - 1;
		double distance = 0, max = 0;
		while (j > 0) {
			double temp = arr[j] - min;
			if (temp > 180) {
				distance = 360 - temp;
			} else {
				distance = temp;
			}
			if (max < distance) {
				max = distance;
			} 
		}
		return max;
	}
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = "";
			while (!str.equals("EOF")) {
				str = bf.readLine();
				int n = Integer.parseInt(str);
				double[] arr = new double[n];
				for (int i = 0; i < n; i++) {
					str = bf.readLine();
					arr[i] = Double.parseDouble(str);
				}
				System.out.printf("%.8f\n", f(arr));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		ArrayList<Double> arrayList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			arrayList.add(Double.parseDouble(s));
		}
		ArrayList<Double> lengths = new ArrayList<>();
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				lengths.add(Math.abs(arrayList.get(j) - arrayList.get(i)));
			}
		}
		System.out.printf("%.8f", sortLength(lengths));
	}

	public static double sortLength(ArrayList<Double> arrayList) {
		Collections.sort(arrayList, new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return Double.compare(Math.abs(o1 - 180), Math.abs(o2 - 180));
			}
		});
		return arrayList.get(0);
	}
}
 */
