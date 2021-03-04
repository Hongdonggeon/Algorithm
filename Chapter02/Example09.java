package Chapter02;
import java.util.*;
public class Example09 {
		
	static int[][]mdays= {
			{31, 28,31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29,31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	};
	
	static int isLeap(int year) {
		return (year%4==0 && year %100 !=0 || year %400 ==0 ? 1:0);
	}
	
	static int dayOfYear(int y, int m, int d) {
	
		while(--m !=0) {
			
			d+=mdays[isLeap(y)][m-1];
		}
		return d;
		
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int day= mdays[isLeap(y)][m-1]-d;
		while(++m !=13) {
			day+=mdays[isLeap(y)][m-1];
		}
		return day;
		}
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ���� �ϼ��� ���մϴ�.");
		do {
			System.out.print("�� : ");
			int year = input.nextInt();
			System.out.print("�� : ");
			int month = input.nextInt();
			System.out.print("�� : ");
			int day = input.nextInt();
			
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));
			System.out.printf("�� �� %d�� ���ҽ��ϴ�.\n", leftDayOfYear(year, month, day));
			
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry =input.nextInt();
		}while(retry==1);
	}
}


