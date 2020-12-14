package ch14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
        Scanner s = null;
        try {
			int a, b;
			s = new Scanner(System.in);
		System.out.println("입력 받은 두수를 나누기");
		System.out.println("첫번째 숫자");
			a = s.nextInt();
		System.out.println("두번째 숫자");
		    b = s.nextInt();
		System.out.println(a+"/"+b+"="+(a/b));
		} catch (ArithmeticException e) { 
//catch 상위 클래스인 Exception 이 먼저 오면 다음 것들은 죽은 코드
			System.out.println("계산예외");
		} catch (InputMismatchException e) {
	System.out.println("포멧예외");
		} finally {
			s.close();
		}
	}
}
