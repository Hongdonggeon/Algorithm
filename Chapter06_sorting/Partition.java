package Chapter06;

import java.util.Scanner;

public class Partition {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void partition(int[] a, int n) {
		int pl = 0;
		int pr = n - 1;
		int x = a[n / 2];

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
	
		
		System.out.println("�ǹ��� ���� " + x + "�Դϴ�.");
		System.out.println("�ǹ� ������ �׷�");
		for (int i = 0; i <= pl-1; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("�ǹ��� ��ġ�ϴ� �׷�");
			for (int i = pr+1; i <= pl-1; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		System.out.println("�ǹ� �̻��� �׷�");
		for (int i = pr+1; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�迭�� �����ϴ�.");
		System.out.print("��ڼ� : ");
		int n =input.nextInt();
		int []x = new int[n];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = input.nextInt();
		}
		partition(x, n);
	}
}
