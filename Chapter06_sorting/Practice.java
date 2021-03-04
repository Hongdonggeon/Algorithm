package Chapter06;

public class Practice {
	static void swap(int[] ar, int idx1, int idx2) {
		int temp = ar[idx1];
		ar[idx1] = ar[idx2];
		ar[idx2] = temp;
	}

	static void bubbleSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			int exchg = 0;
			for (int j = ar.length - 1; j > i; j--) {
				if (ar[j - 1] > ar[j]) {
					swap(ar, j - 1, j);
					exchg++;
				}
			}
			if (exchg == 0)
				return;
		}
	}

	static void insertionSort(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int temp = ar[i];
			int j;
			for(j =i ; j>0 && ar[j-1] > temp; j--) {
				ar[j]= ar[j-1];
			}
			ar[j]=temp;
		}
	}

	public static void main(String[] args) {
		int[] ar = { 3, 2, 1, 4, 5 };
//		bubbleSort(ar);
		insertionSort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
