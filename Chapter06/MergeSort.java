package Chapter06;

import java.util.*;

public class MergeSort {
	static int[] buff;

	static void _mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int i; // a 인덱스
			int center = (left + right) / 2;
			int p = 0; // buff에 복사하기 위한 인덱스, 복사한 길이
			int j = 0; // buff 인덱스
			int k = left;

			_mergeSort(a, left, center);
			_mergeSort(a, center + 1, right);

			for (i = left; i <= center; i++)
				buff[p++] = a[i];

			while (i <= right && j < p)
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];

			while (j < p)
				a[k++] = buff[j++];
		}
	}

	static void mergeSort(int[] a, int n) {
		buff = new int[n]; // 작업용 배열을 생성
		_mergeSort(a, 0, n - 1); // 배열 전체를 병합 정렬
		buff = null; // 작업용 배열을 해제
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = input.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}

		mergeSort(x, n);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
