package Chapter01;

import java.util.Scanner;

public class Example11 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n = input.nextInt();
		int check =1;
		while(true) {
			if(n>=10) {
			n/=10;
			check++;
			}
			else {
				break;
			}
		}
		System.out.println(check);
	}
}
