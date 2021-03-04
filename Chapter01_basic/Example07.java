package Chapter01;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
			if(i<n) {
				System.out.print(i+"+");
			}
			else {
				System.out.print(i+"="+sum);
			}
		}
		
	}
}
