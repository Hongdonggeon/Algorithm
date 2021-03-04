package Chapter01;
import java.util.*;
public class Example03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min>b) min =b;
		if(min >c ) min = c;
		if (min >d) min =d;
			return min;
			
	}
	public static void main(String[] args) {
		Random r = new Random();
		int n1= r.nextInt(100)+1;
		int n2= r.nextInt(100)+1;
		int n3= r.nextInt(100)+1;
		int n4= r.nextInt(100)+1;
		int max =min4(n1,n2, n3, n4);
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		System.out.print(n3+" ");
		System.out.println(n4);
		System.out.println(max);
	}
}
