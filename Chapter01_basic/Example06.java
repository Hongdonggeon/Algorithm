package Chapter01;
import java.util.*;
public class Example06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum=0;
		int i =0;
		while (i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		System.out.println(i);
	}
}
