package ch04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//����1.1~30������ ���߿� 3�� ����� ���� ���Ͻÿ�.
		int sum = 0;
		for (int i = 1; i < 31; i++) {
			if(i%3==0) {
				sum+=i;
			}//if
		}//for
		System.out.println("sum : " + sum);
		//����2.1~30������ ���߿� ¦���� Ȧ���� ���� ���� ���Ͻÿ�.
		int sum1 = 0/*¦������*/, sum2 = 0/*Ȧ���� ��*/;
		for (int i = 1; i < 31; i++) {
			if(i%2==0) {
				sum1+=i;
			}else if(i%2!=0) {
				sum2+=i;
			}
		}//--for
		System.out.println("¦���� �� : " + sum1);
		System.out.println("Ȧ���� �� : " + sum2);
		//����3.�Է��� ������ �������� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ ���ڸ� �Է��ϼ���.");
		//int a = sc.nextInt();
		int a = 0;
		for (int i = 1; i < 10; i++) {
			System.out.println(a + " X " + i + " = " +(a*i));
		}
		System.out.println();
		/*����4.1~50���� ���� �߿� 3,6,9���ӿ� ������ ����?
		* 3+6+9+13+16+19+23.....+30+31+32....+39+43+....49=627
		* Hint %, / �� ���
		*/
		sum = 0;
		for (int i = 1; i < 51; i++) {
			int j = i%10;
			int n = i/10;
			if(j==3||j==6||j==9) {
				System.out.print(i+"  ");
				sum+=i;
			}else if(n==3) {
				System.out.print(i+"  ");
				sum+=i;
			}
		}
		System.out.println("\nsum : " + sum);
	}
}