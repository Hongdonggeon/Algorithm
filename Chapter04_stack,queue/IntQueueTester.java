package Chapter04;

import java.util.*;

import Chapter04.IntQueue.EmptyIntQueueException;
import Chapter04.IntQueue.OverflowIntQueueException;
public class IntQueueTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IntQueue s = new IntQueue(6);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size() +" / " + s.capacitiy());
			System.out.print("1.인큐 2.디큐 3.피크 4.덤프 0.종료 : ");
			int menu = input.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x=input.nextInt();
				try {
					s.enque(x);
				} catch (OverflowIntQueueException e) {
					// TODO Auto-generated catch block
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x=s.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				} catch (EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
			break;
			
			case 3:
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 " + x +"입니다.");
				} catch (EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 4:
				s.dump();
				break;
				
			}
		}
	}
}
