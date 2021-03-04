package Chapter04;

import java.util.*;

import Chapter04.IntQueue.EmptyIntQueueException;
import Chapter04.IntQueue.OverflowIntQueueException;
public class IntQueueTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IntQueue s = new IntQueue(6);
		
		while(true) {
			System.out.println("���� ������ �� : "+s.size() +" / " + s.capacitiy());
			System.out.print("1.��ť 2.��ť 3.��ũ 4.���� 0.���� : ");
			int menu = input.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				x=input.nextInt();
				try {
					s.enque(x);
				} catch (OverflowIntQueueException e) {
					// TODO Auto-generated catch block
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
				
			case 2:
				try {
					x=s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
			break;
			
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� �����ʹ� " + x +"�Դϴ�.");
				} catch (EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				s.dump();
				break;
				
			}
		}
	}
}
