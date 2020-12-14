package ch11;

public class StringEx3 {
	public static void main(String[] args) {
		/*args.length�� ���� : �迭�� ������ �Ǹ� �������� ��水ü�� ����� ����.*/
		String s1 = "�������̰� ��ȭ������ �һ���ȸ�� ����."
				 + "�������� 5�� ���� 3�� ���� �Ұ��� �Ե� ��ȭ��"
				 + " 8�� �̺�ƮȦ����... ���� �귣�� ������ȭ��" 
				 + " ȫ���� ���� �һ���ȸ�� �����Ѵ�.";
		/*1��. ���������� ���鹮���� index ��ȣ�� ����Ͻÿ�. 
		 * ex)5, 11,...87,
		 * hint : indexOf �̿�*/
		for (int i = 0; i < s1.length(); i++) {
			int a = s1.indexOf(' ', i);
			if(a==-1) break;
			System.out.print(a + "\t");
			i=a++;
		}

		/*2��. ���������� ���鹮���� index ��ȣ�� ����Ͻÿ�. 
		 * ex)87, 81, 78,.... 5,
		 * hint : lastIndexOf �̿�*/
		System.out.println();
		for (int i = s1.length(); i > 0; i--) {
			int a = s1.lastIndexOf(' ', i);
			if(a==-1) break;
			System.out.print(a + "\t");
			i=a--;
		}
		System.out.println();
		//3��.������ '_'��ȯ�Ͽ� ���
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(c==' ') System.out.print('_');
			else System.out.print(c);
		}
		String s2 = s1.replace(' ', '_');
		System.out.println("\n"+s2);
		//4��.ù�ܾ ����ϱ�
		int a = s1.indexOf(' ');
		String s3 = s1.substring(0, a);
		System.out.println(s3+"***");
		//5��.������ �ܾ� ����ϱ�
		int b = s1.lastIndexOf(' ')+1;
		String s4 = s1.substring(b, s1.length());
		System.out.println("***"+s4);
		//6��.�յڿ� ���� ����
		String s5 = "   ��Ʋ�� �ȵ���̵�&�ڹ�    ";
		System.out.println("***"+s5.trim()+"***");
		//7��.�������� ���ڿ��� ��ȯ
		String s6 = "22";
		int c = Integer.parseInt(s6);
		String s7 = String.valueOf(c);
		System.out.println(s7);
		String s8 = c+"";//����+���ڿ��̸� ���ڰ� �ڵ������� ���ڿ� ��ȯ
		//8��.���ڿ��� Ư������ �����Ͽ� ������.
		String s9 = "JAVA&JSP&Android&Spring";
		String s10[] = s9.split("&");
		for (int i = 0; i < s10.length; i++) {
			System.out.println(s10[i]);
		}
	}
}












