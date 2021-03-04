package Chapter03;

import java.util.*;

class BinSearch {

	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key)
				return pc;
			else if (key > a[pc])
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int size = input.nextInt();
		int[] x = new int[size];

		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}
		Arrays.sort(x); // 배열 오름차순 정렬하는 메소드

		System.out.print("키 값 : ");
		int key = input.nextInt();
		int index = binSearch(x, size, key);

		if (index == -1)
			System.out.println("찾는 값이 존재하지 않습니다.");
		else
			System.out.println(key + "는 x[" + index + "]에 있습니다.");
	}
}