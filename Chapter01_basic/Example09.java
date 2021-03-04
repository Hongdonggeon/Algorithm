package Chapter01;

import java.util.Random;

public class Example09 {
	static int sumof(int a, int b) {
		// min, max 변수 선언해서 a,b중 큰 값을 max 에 넣고 나머지 값을 min에 넣은것이 더 효율적
		int sum=0;
		if(a<=b) {
		for (int i = a; i <=b; i++) {
			sum+=i;
		}
		}
		else {
			for (int i = b; i <=a; i++) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Random r = new Random();
		int n1= r.nextInt(10)+1;
		int n2= r.nextInt(10)+1;
		System.out.println(n1+" 과 " +n2+"사이의 합 : "+sumof(n1, n2));
	}
}
