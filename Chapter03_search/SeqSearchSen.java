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
		System.out.print("�迭 ���� : ");
		int size = input.nextInt(); // �迭 ����
		System.out.print("ã�� Ű �� : ");
		int key = input.nextInt(); // ã�� Ű��
		int[] arNum = new int[size+1];
		for (int i = 0; i < size; i++) {
			System.out.printf("arNum[%d] : ",i);
			arNum[i]= input.nextInt();
		}
		int index = seqSearchSen(arNum, size, key); // ã�� Ű ������ �ε��� ��, ������ -1
		if(index ==-1) {
			System.out.println("ã�� Ű ���� �����ϴ�.");
		}
		else{
			System.out.println("Ű ���� �����ϴ� �ε��� : "+index);
		}
	}
}
