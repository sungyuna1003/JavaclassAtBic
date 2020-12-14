package ch04;

import java.util.Random;

public class Lotto1 {
	public static void main(String[] args) {
		Random r = new Random();
		int lotto[] = new int[6];
		System.out.println("로또의 선택숫자는");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; //i=i-1 를 줄여쓴다면, i--
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  " + "\t");
		}
		System.out.println("입니다.");
	}
}