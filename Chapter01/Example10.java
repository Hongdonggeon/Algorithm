package Chapter01;

import java.util.*;
public class Example10 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = input.nextInt();
		int b;
		do {
			System.out.print("b의 값 : ");
			b = input.nextInt();
			if(a>=b)
				System.out.println("a보다 큰 값을 입력하세요!");
		}while(a>=b);
		

		
		System.out.println("b-a는 "+ (b-a)+"입니다.");
	}
}
