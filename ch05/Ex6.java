package ch05;

class A6{
	A6(){
		/*this �� �ڱ� �ڽ��� ����Ű�� Ű����
		 * this () �����ڿ� �ݵ�� ù��° ���ο� �;���
		 * �׷��� this()�� super()�� ����� ���� ��� �� �� ����*/
        this("msg");
        System.out.println("����Ʈ ������");
        //����Ʈ �����ڸ� �ʿ��� �ڵ�
	}
	A6(int a){
	          this("msg");
}
	A6(String s){
		super ();
		System.out.println("���ڿ� ������");
		//�����ڰ� �ؾ� �� ������ �ڵ尡 �� ����
}
}
class B6 extends A6{
	
}
public class Ex6 {


	public static void main(String[] args) {
  A6 a = new A6();
	}

}
