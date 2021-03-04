package Chapter05;
import java.util.*;
public class EuclidGCD {
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x =input.nextInt();
		int y = input.nextInt();
		System.out.println("최대 공약수는" + gcd(x,y)+" 입니다.");
	}
}
