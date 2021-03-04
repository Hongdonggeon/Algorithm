package Chapter01;

public class Example15 {
	public static void main(String[] args) {
		triangleleLB(5);
		System.out.println();
		triangleleLU(7);
		System.out.println();
		triangleRU(5);
		System.out.println();
		triangleRB(10);
		
	}
	//왼쪽 아래
	static void triangleleLB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 왼쪽 위
	static void triangleleLU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 오른쪽 위
	static void triangleRU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i>j) {
					System.out.print("  ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	//오른쪽 아래
	static void triangleRB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(n-i-1>j) {
					System.out.print("  ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
