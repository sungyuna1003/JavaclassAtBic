package ch05;

/*���: ��� Ŭ������ super Ŭ������ ����.
 * �� Object �� ����.
 */
class A5  extends Object{
	public A5() {
		/*super �� �θ� ��Ī�ϴ�.super() <-�θ��� ������
		 * super() �����ڴ� sub �������� �ݵ�� ù��° ���ο� ������ �Ǿ��ִ�. ��������
		 */
		super(); 
		System.out.println("A5 Ŭ���� ������");
	}
}

class B5  extends A5 {
	public B5 () {
		super();
		System.out.println("B5 Ŭ���� ������");
	}
}

public class Ex5 {
	public static void main(String[] args) {
     B5 s = new B5();
 
	}

}
