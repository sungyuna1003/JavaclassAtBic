package ch08;

import java.awt.Frame;

import ch08_1.Ex2_1;
//���������� SUN���� �����Ǵ� �����Ǵ� Ŭ������ ������ package�� �� �� ����.
//������ SUN���� �����Ǵ� �ʵ� �� �޼ҵ� �߿� protected�� ����̸� puclic, ���x:private.
class A2 extends Ex2_1 {
	public void prn() {
//	System.out.println("x:"+x);
		System.out.println("y:"+y); //����Ŭ����
		System.out.println("z:"+z);
	}
}

class MyFrame extends Frame{
	public void prn() {
		paramString(); //��Ӱ����̱� ������ public ��.
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Ex2_1 e = new Ex2_1();
//		e.x = 10;
//		e.y = 10;
   		    e.z = 10;
	
   		    
   	Frame f = new Frame();
//   	f.paramString(); //��Ӱ��谡 �ƴϹǷ� private�� ��.
   	
   	
	}

}
