package ch05;

/*1. Ŭ���� ���� : �ʵ�� �޼ҵ� ����
 * �ʵ� : ��ü�� �Ӽ�(���)
 * �޼ҵ� : ��ü�� �ݺ����� ���(����)
 */
class Car1 {
	// �ʵ� ���� : �ݵ�� Ŭ���� �ȿ� ����� ����
	String carName;
	int velocity;
	String CarColor;

	// �޼ҵ� ���� : ����Ÿ�� ���� �޼ҵ��(){}
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if (velocity<0) {
			velocity=0;
	}
}

	void stop() {
		velocity=0;
	}
	
}
public class CarEx1 {
	
	public static void main(String[] args) {
		
  //��ü: �� ������� Ŭ������ ������ ������ �����
		Car1 c1; // Car1 Ÿ���� ������ ����
	     //���۷��� ����:
		c1 = new Car1(); //new Ű���尡 �����Ѵ�.
	    //������ ��ü�� �ʵ�� �޼ҵ� �����:���۷�������.�ʵ�/�޼ҵ�
		c1.carName ="BMW 5�ø���";
		c1.CarColor ="���";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.CarColor);
		System.out.println(c1.velocity);
	   //String Ŭ���� ���ؼ� ��ü�� ����
		String s = new String("abcdef");
	   //s�� ���ڸ� �빮�ڷ� ���
		System.out.println(s.toUpperCase());
	   //s�� ������ ���� ���
		System.out.println(s.length());
 }
}