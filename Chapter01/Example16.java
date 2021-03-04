package Chapter01;

public class Example16 {
	public static void main(String[] args) {
		spira(30);
	}
	static void spira(int n) {
		int cnt=n+1;
		for(int i=1; i<= n; i++) {
			
			if(i!=1) {
			cnt= cnt+2;
			}
			
			for (int j = 1; j <=(n-1)*2+1 ; j++) {
				if(i+j >= n+1 && i+j <=cnt) 
					System.out.print("*");
				else 
					System.out.print("  ");
				}
			
			System.out.println();
		}
	}
}
