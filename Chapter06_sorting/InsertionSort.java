package Chapter06;

import java.util.Scanner;

public class InsertionSort {
	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}

		insertionSort(x, n);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
