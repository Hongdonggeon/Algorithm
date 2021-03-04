package Chapter02;

import java.util.*;
public class Example02 {
	static void swap(int[]a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1]= a[idx2];
		a[idx2] = temp;
		System.out.println("a["+idx1+"] 과 a["+idx2+"] 를 교환합니다.");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a,i,a.length-i-1);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	static int sumOf(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = input.nextInt();
		
		int []x = new int[num];
		
		for (int i = 0; i < x.length; i++) {
		 x[i]=input.nextInt();
		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		reverse(x);
		System.out.println("x 배열 요솟값들의 총 합은"+sumOf(x));
		
		}
	}

