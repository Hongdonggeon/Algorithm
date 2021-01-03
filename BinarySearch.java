package Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
		int index = Arrays.binarySearch(x, key);

		if (index <0)
			System.out.println("���� ����Ʈ�� �� : "+(Math.abs(index+1)));
		else
			System.out.println(key + "�� x[" + index + "]�� �ֽ��ϴ�.");
	}
}
// Math.abs() : ���� �� ��� BUT, ����� �״�� ����� ���