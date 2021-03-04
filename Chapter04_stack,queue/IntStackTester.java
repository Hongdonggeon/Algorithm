package Chapter04;

import java.util.*;

import Chapter04.IntStack.EmptyIntStackException;
import Chapter04.IntStack.OverflowIntStackException;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IntStack s = new IntStack(6);

		while (true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.print("1.Ǫ�� 2.�� 3.��ũ 4.���� 0.���� : ");
			int menu = input.nextInt();
			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = input.nextInt();
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					System.out.println("������ ����á���ϴ�.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("pop�� �����ʹ� " + x + "�Դϴ�.");
				} catch (EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("peek�� �����ʹ� " + x + "�Դϴ�.");
				} catch (EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			case 4:
				s.dump();
				break;

			}
		}
	}
}
