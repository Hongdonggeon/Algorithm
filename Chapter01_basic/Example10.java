package Chapter01;

import java.util.*;
public class Example10 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("a�� �� : ");
		int a = input.nextInt();
		int b;
		do {
			System.out.print("b�� �� : ");
			b = input.nextInt();
			if(a>=b)
				System.out.println("a���� ū ���� �Է��ϼ���!");
		}while(a>=b);
		

		
		System.out.println("b-a�� "+ (b-a)+"�Դϴ�.");
	}
}
