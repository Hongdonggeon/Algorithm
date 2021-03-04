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
		System.out.print("��ڼ� : ");
		int size = input.nextInt();
		int[] x = new int[size];

		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}
		Arrays.sort(x); // �迭 �������� �����ϴ� �޼ҵ�

		System.out.print("Ű �� : ");
		int key = input.nextInt();
		int index = binSearch(x, size, key);

		if (index == -1)
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		else
			System.out.println(key + "�� x[" + index + "]�� �ֽ��ϴ�.");
	}
}