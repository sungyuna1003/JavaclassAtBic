package ch05;

public class Ex1 {

	/*메서드(객체가 반복적인 기능을 함수로 만든 것) 4가지 타입
	 * 1. 리턴타입 없고 매개변수 없음. 
	 * 2. 리턴타입 있고(only 1) 매개변수 없음.
	 * 3. 리턴타입 없고, 매개변수 있음.
	 * 4. 리턴타입 있고, 매개변수 있음.
	 */
	
	void a1(){
		
	}
	int a2() {
		int a = 22;
		return a;
	}
	String a3() {
		String s = "오늘은 화요일";// 유일하게 new 연산자 없이 객체 생성 가능
		return s;
	}
	void a4 (int a, String s, boolean flag) {
		
	}
	String a5(String s1, String s2) {
		String s = s1 + s2;
		return s;
	}
	
	/*메서드 오버로딩(Overloading) : 같은 클래스 내에 동일한 메소드 명으로 선언
	 * 단, 매개 변수의 타입과 갯수가 달라야함.
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
