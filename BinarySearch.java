package Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
		int index = Arrays.binarySearch(x, key);

		if (index <0)
			System.out.println("삽입 포인트의 값 : "+(Math.abs(index+1)));
		else
			System.out.println(key + "는 x[" + index + "]에 있습니다.");
	}
}
// Math.abs() : 음수 → 양수 BUT, 양수는 그대로 양수값 출력