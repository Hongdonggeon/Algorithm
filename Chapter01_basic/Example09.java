package Chapter01;

import java.util.Random;

public class Example09 {
	static int sumof(int a, int b) {
		// min, max ���� �����ؼ� a,b�� ū ���� max �� �ְ� ������ ���� min�� �������� �� ȿ����
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
		System.out.println(n1+" �� " +n2+"������ �� : "+sumof(n1, n2));
	}
}
