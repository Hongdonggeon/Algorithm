package Chapter06;

import java.util.Scanner;

public class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min])
					min = j;
			}
			swap(a, i, min);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}

		selectionSort(x, n);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
