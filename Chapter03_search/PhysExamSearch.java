package Chapter03;

import java.util.*;

public class PhysExamSearch {

	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		@Override
		public String toString() {
			return name + " " + height + " " + vision;
		}
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

	}

	private static class HeightOrderComparator implements Comparator<PhyscData> {
		@Override
		public int compare(PhyscData o1, PhyscData o2) {
			return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
		}
}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("�̳���", 162, 0.3), new PhyscData("�̳���", 168, 0.4),
				new PhyscData("�̳���", 169, 0.8), new PhyscData("�̳���", 171, 1.5), new PhyscData("�̳���", 173, 0.7),
				new PhyscData("�̳���", 174, 1.2), new PhyscData("�̳���", 175, 2.0), };

		System.out.print("�� cm �� ����� ã�� �ֳ���?");
		int height = input.nextInt();
		int index = Arrays.binarySearch(x, new PhyscData(null, height, 0.0), PhyscData.HEIGHT_ORDER);

		if (index < 0)
			System.out.println("��Ұ� �����ϴ�.");

		else {
			System.out.println("ã�� ���� x[" + index + "]�� �ֽ��ϴ�.");
		}
	}
}
