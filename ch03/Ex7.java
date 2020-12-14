package ch03;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
     //컨솔창에 값을 입력받기 위해 스캐너 객체 생성(new)
		//int i = Scanner 같은 말
		Scanner sc = new Scanner(System.in);
   System.out.println("비교가 필요한 숫자 두개를 입력하세요.");
   System.out.print("첫번째 숫자 :");
   int a = sc.nextInt();
   System.out.print("두번째 숫자 :");
   int b = sc.nextInt();
   //System.out.println(a+":"+b);
	int c = (a>b)?a:b;
	System.out.println("입력한 숫자 중 큰값은"+ c +"이다.");
	}
}
