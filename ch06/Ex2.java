package ch06;

/*static : 필드, 메소드,클래스(특수한 상황)
 * static(정적인) 메모리 영역: 객체가 생성되기 전에 미리 만들어 지는 메모리 영역
 * 클래스 앞에 올 수 있는 접근 제어자는 public 밖에 없다.*/

class A2 {
	/*
	 * static 변수와 non-static 변수 중 누가 먼저 메모리에 만들어 질까? -> static 변수. 객체를 사용 하지 않고도 사용
	 * 가능한 변수가 static 이므로 static 변수는 클래스명으로 접근 ex) A2.a
	 */
	static int a;
	int b;
	static void prn() {
		/*non-static 변수는 static 메소드 사용불가: 
		 * 이유:non-static 변수는 반드시 객체를 생성해야 만들어 지는 변수잊만, static 매소드는 객체를
		 * 생성하지 않아도 사용 가능한 메소드이므로 순서가 위배된다.
		 *System.out.println(a+b); */
	}
	void prn1() {
		System.out.println(a+b);
	}
}

public class Ex2 {
	public static void main(String[] args) {
		A2.a = 22;
		System.out.println(A2.a);
		A2 aa = new A2();
		aa.a=23;
		aa.b=24;
		System.out.println(aa.a+":"+aa.b);
	}
}
