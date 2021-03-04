package Chapter03;

import java.util.*;

public class SeqSearchSen {
	static int seqSearchSen(int ar[], int s, int k) {
		ar[s] = k;
		int i = 0;
		while (true) {
			if (ar[i] == ar[s])
				break;
			i++;
		}
		return i == s ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("배열 길이 : ");
		int size = input.nextInt(); // 배열 길이
		System.out.print("찾을 키 값 : ");
		int key = input.nextInt(); // 찾을 키값
		int[] arNum = new int[size+1];
		for (int i = 0; i < size; i++) {
			System.out.printf("arNum[%d] : ",i);
			arNum[i]= input.nextInt();
		}
		int index = seqSearchSen(arNum, size, key); // 찾는 키 있으면 인덱스 값, 없으면 -1
		if(index ==-1) {
			System.out.println("찾는 키 값이 없습니다.");
		}
		else{
			System.out.println("키 값이 존재하는 인덱스 : "+index);
		}
	}
}
