package sql;

import java.util.Scanner;

//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class baek_9498 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	   int score = scanner.nextInt(); //nextInt�� �ȶ߸� ���� Scanner �̸��� �´��� ��
	
	   if(score>90) {
		   System.out.println("A");
	   } else if(score>80) {
		   System.out.println("B");
	   } else if(score>70) {
		   System.out.println("C");
	   } else if(score>60) {
		  System.out.println("D");
	} else {
		System.out.println("F");
	}
	}
}
