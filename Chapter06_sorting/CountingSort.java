package Chapter06;

import java.util.Scanner;

public class CountingSort {
	static int[] sort;

	static void countingSort(int[] a, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = ((max < a[i]) ? a[i] : max);
		}
		sort = new int[n];
		int[] count = new int[max + 1];

		for (int i = 0; i < n; i++) {
			++count[a[i]];
		}

		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}

		for (int i = 0; i < n; i++) {
			sort[--count[a[i]]] = a[i];
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = input.nextInt();
		}
		countingSort(ar, n);

		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}

	}
}
