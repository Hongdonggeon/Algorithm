package Chapter02;

public class Practice10 {
	public static void main(String[] args) {
		int cnt =0;
		int idx=0;
		int[] prime = new int[500];
		
		prime[idx++]=2;
		
		for (int i = 3; i <= 20; i+=2) {
				int j;
			for (j = 1; j <idx ; j++) {
				cnt++;
				if(i % prime[j] ==0)
					break;
			}
			if (idx == j) {
				prime[idx++] =i;
			}
		}
		for (int i = 0; i < idx; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö : " + cnt);
	}
}
