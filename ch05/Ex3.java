package ch05;

class A3{
	  int a;
  /*������ : ��ü�� ����� Ư���� �޼���
   * 1. Ŭ������� ����
   * 2. ����Ÿ�� ���� ��ü�� ����.
   * 3. ���࿡ Ŭ���� �ȿ� ������ ���� X. JVM�� ����Ʈ �����ڸ� ����
   * 4. �����ڰ� �ϳ��� ���ǰ� �Ǿ�������, JVM�� ����Ʈ ������ ���� X
   */
	   A3 (){
		   System.out.println("������ ȣ��");
	   }
	   A3(String s) {
		   
	   }
	   A3(int a){
		   
	   }

}

public class Ex3 {
	public static void main(String[] args) {
		 //�����ڰ� ���� �����ϴ� ����: ��ü�� �����Ǵ� �پ��� case�� ����.
     A3 aa = new A3();
     A3 bb = new A3("����");
     A3 cc = new A3(23);
     new String(); // String Ŭ������ ������ 15�� ����.
	}
}
