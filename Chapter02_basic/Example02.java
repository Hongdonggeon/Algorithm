package Chapter02;

import java.util.*;
public class Example02 {
	static void swap(int[]a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1]= a[idx2];
		a[idx2] = temp;
		System.out.println("a["+idx1+"] �� a["+idx2+"] �� ��ȯ�մϴ�.");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a,i,a.length-i-1);
		}
		System.out.println("���� ������ ���ƽ��ϴ�.");
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
		System.out.print("��ڼ� : ");
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
		System.out.println("x �迭 ��ڰ����� �� ����"+sumOf(x));
		
		}
	}

