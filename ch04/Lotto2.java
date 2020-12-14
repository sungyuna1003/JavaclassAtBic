package ch04;

import java.util.Arrays;
import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		int lucky[] = getLotto();
		for (int i = 0; i < lucky.length; i++) {
			System.out.print(lucky[i] + "\t");
		}
	}

	// �ζ� ��ȣ ����(��ȯ) ����� �޼ҵ� ����
	public static int[] getLotto() {
		Random r = new Random();
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			// �ߺ��� �ȵǸ� ���� ������ �ݺ���
			while (true) {
				int j = r.nextInt(45) + 1;
				lotto[i] = j;
				boolean flag = false;
				switch (i) {
				  case 0: flag = true;
				  case 1: if(j!=lotto[0]) flag = true;
				  case 2: if(j!=lotto[0]&&j!=lotto[1]) flag = true;
				  case 3: if(j!=lotto[0]&&j!=lotto[1]&&j!=lotto[2]) flag = true;
				  case 4: if(j!=lotto[0]&&j!=lotto[1]&&j!=lotto[2]&&j!=lotto[3]) flag = true;
				  case 5: if(j!=lotto[0]&&j!=lotto[1]&&j!=lotto[2]&&j!=lotto[3]&&j!=lotto[4]) flag = true;
				} // switch
				if (flag) {break;}
			} // while
		} // for

		Arrays.sort(lotto); // �ڵ� �������� ���� (��������)
		return lotto;
	}
}
