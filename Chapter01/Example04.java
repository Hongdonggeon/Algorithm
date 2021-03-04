package Chapter01;

public class Example04 {
	static int median (int a, int b, int c) {
		int mid =0;
		if(a>=b) {
			if(a>=c) {
				if(b>=c) mid =b;
				else mid =c;
			}
			else mid =a;
		}
		else {
			if(b>=c) {
				if(a>=c)mid=a;
				else mid =c;
			}
			else mid =b;
		}
		return mid;
	}
	public static void main(String[] args) {
		System.out.println(median(3,2,1));
		System.out.println(median(3,2,2));
		System.out.println(median(3,1,2));
		System.out.println(median(3,2,3));
		System.out.println(median(2,1,3));
		System.out.println(median(3,3,2));
		System.out.println(median(3,3,3));
		System.out.println(median(2,2,3));
		System.out.println(median(2,3,1));
		System.out.println(median(2,3,2));
		System.out.println(median(1,3,2));
		System.out.println(median(2,3,3));
		System.out.println(median(1,2,3));
	}
}
