package Chapter01;

import java.util.Random;
import java.util.Scanner;

public class Example01 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max<b) max =b;
		if(max <c ) max = c;
		if (max <d) max =d;
			return max;
			
	}
	public static void main(String[] args) {
		Random r = new Random();
		int n1= r.nextInt(100)+1;
		int n2= r.nextInt(100)+1;
		int n3= r.nextInt(100)+1;
		int n4= r.nextInt(100)+1;
		int max =max4(n1,n2, n3, n4);
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		System.out.print(n3+" ");
		System.out.println(n4);
		System.out.println(max);
	}
}
