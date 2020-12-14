package ch05;

class A6{
	A6(){
		/*this 는 자기 자신을 가르키는 키워드
		 * this () 생성자에 반드시 첫번째 라인에 와야함
		 * 그래서 this()와 super()는 절대로 같이 사용 할 수 없다*/
        this("msg");
        System.out.println("디폴트 생성자");
        //디폴트 생성자만 필요한 코드
	}
	A6(int a){
	          this("msg");
}
	A6(String s){
		super ();
		System.out.println("문자열 생성자");
		//생성자가 해야 할 역할의 코드가 들어간 상태
}
}
class B6 extends A6{
	
}
public class Ex6 {


	public static void main(String[] args) {
  A6 a = new A6();
	}

}
