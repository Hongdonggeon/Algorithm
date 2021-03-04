package Chapter02;
import java.util.*;

public class Example06 {
	static int cardConv(int x, int r, char[] d) {
		int digit =0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char [] temp = new char[32];
		do {
			temp[digit++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		
		for (int i = 0; i < digit; i++) {
			d[i]=temp[digit-i-1];
		}
		
		return digit;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int no; //��ȯ�ϴ� ����
		int cd; // ���
		int dno; //��ȯ ���� �ڸ���
		int retry; 
		char[] cno = new char[32]; // ��ȯ�� �� �ڸ��� ���ڸ� �־�δ� ���ڿ� �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = input.nextInt();
			}while(no<0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd=input.nextInt();
			}while(cd <2 || cd>36);
		
			dno=cardConv(no, cd, cno);
			System.out.print(cd + "�����δ� ");
			for (int i = 0; i <dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
				
				System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
				retry =input.nextInt();
			
		}while(retry==1);
	}
}

