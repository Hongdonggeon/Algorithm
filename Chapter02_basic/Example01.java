package Chapter02;
import java.util.*;

class Example01{
	static int maxof(int[] a) {
		int max= a[0];
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	System.out.println("키의 최댓값을 구합니다.");
	System.out.print("사람 수 : ");
	int num = rand.nextInt(10)+1;
	System.out.println(num);
	int[] height = new int[num];
	
	System.out.println("키 값은 아래와 같습니다.");
	for (int i = 0; i < num; i++) {
		height[i]= 100+ rand.nextInt(90);
		System.out.println("height[" +i+"] : " +height[i]);
	}
	
	System.out.println("최대값은" + maxof(height)+"입니다.");
	
	}
}