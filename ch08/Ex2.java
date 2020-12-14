package ch08;

import java.awt.Frame;

import ch08_1.Ex2_1;
//현실적으로 SUN에서 제공되는 제공되는 클래스와 동일한 package는 될 수 없다.
//때문에 SUN에서 제공되는 필드 및 메소드 중에 protected는 상속이면 puclic, 상속x:private.
class A2 extends Ex2_1 {
	public void prn() {
//	System.out.println("x:"+x);
		System.out.println("y:"+y); //하위클래스
		System.out.println("z:"+z);
	}
}

class MyFrame extends Frame{
	public void prn() {
		paramString(); //상속관계이기 때문에 public 됨.
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Ex2_1 e = new Ex2_1();
//		e.x = 10;
//		e.y = 10;
   		    e.z = 10;
	
   		    
   	Frame f = new Frame();
//   	f.paramString(); //상속관계가 아니므로 private가 됨.
   	
   	
	}

}
