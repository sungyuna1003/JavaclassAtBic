package ch04;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��(month)�� �Է��ϼ���.");
		int m = sc.nextInt();
		switch (m)  {
		case 12:
		case 1:
	    case 2:
			System.out.println("�ܿ��Դϴ�.");
		break;
	    case 3:
		case 4:
	    case 5:
			System.out.println("���Դϴ�.");
			break;
	    case 6:
		case 7:
	    case 8:
			System.out.println("�����Դϴ�.");
			break;
	    case 9:
		case 10:
	    case 11:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�ش�Ǵ� ������ �����ϴ�.");
			break;
		}
		
	  String m1 = "february";
	  switch (m1) {
	  case "january":
		  System.out.println("1����");
		  break;
	  case "february":
		  System.out.println("2����");
		  break;
	  }
	}
}