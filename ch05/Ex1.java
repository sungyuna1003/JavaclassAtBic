package ch05;

public class Ex1 {

	/*�޼���(��ü�� �ݺ����� ����� �Լ��� ���� ��) 4���� Ÿ��
	 * 1. ����Ÿ�� ���� �Ű����� ����. 
	 * 2. ����Ÿ�� �ְ�(only 1) �Ű����� ����.
	 * 3. ����Ÿ�� ����, �Ű����� ����.
	 * 4. ����Ÿ�� �ְ�, �Ű����� ����.
	 */
	
	void a1(){
		
	}
	int a2() {
		int a = 22;
		return a;
	}
	String a3() {
		String s = "������ ȭ����";// �����ϰ� new ������ ���� ��ü ���� ����
		return s;
	}
	void a4 (int a, String s, boolean flag) {
		
	}
	String a5(String s1, String s2) {
		String s = s1 + s2;
		return s;
	}
	
	/*�޼��� �����ε�(Overloading) : ���� Ŭ���� ���� ������ �޼ҵ� ������ ����
	 * ��, �Ű� ������ Ÿ�԰� ������ �޶����.
	 */
	
	int plus(int a, int b) {
		return a + b;
	}
		double plus(double a, double b) {
			return a + b;	
	}
		
	public static void main(String[] args) {
       int a = 22, b =23;
       int c = Math.max(a, b);
       double d1 = 3.14, d2 = 5.66;
       double d3 = Math.max(d1, d2);
      System.out.println();
	}

}
