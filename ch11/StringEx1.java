package ch11;

public class StringEx1 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
// String �����: new ������ ���� ��ü�� �����ϸ� ��������� �����̰�
// �ߺ��� ���ڿ��� �ִٸ� ���Ӱ� ������ �ʰ� �����ϴ� ����� �ִ�
		String s3 = "Java";
		String s4 = "Java";
//������ type ���� ==�� ���۷��� �ּҰ��� ��
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		System.out.println(s1 == s2);
		s1 = s2;
// s2����Ű�°� s1������
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4); 
		System.out.println("---------------"); 
	
		//equals(Object)�޼ҵ�� ��ü�� ������ ��
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		String s5 = "apple";
		String s6 = "APPLE";
		System.out.println(s5.equalsIgnoreCase((s6)));
	}

}
