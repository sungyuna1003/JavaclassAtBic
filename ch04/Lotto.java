package ch04;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		//�ζ�:1~45������ �ߺ����� 6���� ��ȣ ����.
		Random r = new Random();
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;//0~44������ ����
			System.out.print(lotto[i] + "\t");
		}
	}
}

