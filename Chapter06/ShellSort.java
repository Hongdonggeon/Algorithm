package Chapter06;
import java.util.*;

public class ShellSort {
	static void shellSort(int[] a, int n) {
		for (int h = n/2; h >0 ; h/=2) { // ΑυΊΠ°ͺ 3, 1....
			for (int i = h; i < n ; i++) {
				int j;
				int tmp =a[i];
				for (j = i -h; j>= 0 && a[j] > tmp; j-=h) {
					a[j +h] = a[j];
				}
				a[j+h] = tmp;
			}
		}
	}
	
	static void shellSort2(int[] a, int n) {
		int h;
		for (h=1; h<n/9; h=h*3+1);

		for ( ; h >0 ; h/=3) {
			for(int i =h; i<n; i++) {
				int j;
				int tmp = a[i];
				for (j=i-h; j>=0 && a[j] > tmp; j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}

		shellSort2(x, n);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	}
	

