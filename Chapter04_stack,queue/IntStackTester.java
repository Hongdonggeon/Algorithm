package Chapter04;

import java.util.*;

import Chapter04.IntStack.EmptyIntStackException;
import Chapter04.IntStack.OverflowIntStackException;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IntStack s = new IntStack(6);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.print("1.푸시 2.팝 3.피크 4.덤프 0.종료 : ");
			int menu = input.nextInt();
			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = input.nextInt();
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					System.out.println("스택이 가득찼습니다.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("pop한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("peek한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4:
				s.dump();
				break;

			}
		}
	}
}
