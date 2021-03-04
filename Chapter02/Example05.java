package Chapter02;

import java.util.*;
public class Example05 {
	static void rcopy(int[] a, int[] b) {
		int num= a.length >= b.length ? b.length : a.length;
		for (int i = 0; i < num; i++) {
			a[i]=b[b.length-i-1];
		}
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("배열 a의 요솟수 : ");
		int num1 = input.nextInt();
		
		int[] a = new int[num1];
		
		for (int i = 0; i < num1; i++) {
			System.out.print("a[" + i +"] : " );
			a[i]=input.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int num2 = input.nextInt();
		
		int[] b = new int[num2];
		
		for (int i = 0; i < num2; i++) {
			System.out.print("b[" + i +"] : " );
			b[i]=input.nextInt();
		}
		rcopy(a, b);
		for (int i = 0; i < num1; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
