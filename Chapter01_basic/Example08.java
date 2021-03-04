package Chapter01;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n =input.nextInt();
		int sum =0;
		if(n%2==1) {
			sum = (1+n) *(n/2)+(n+1)/2;
		}
		else {
			sum=(1+n) *(n/2);
		}
		System.out.println(sum);
	}
}
