package ch03;

public class Ex4 {

	public static void main(String[] args) {
       int a = 10;
       a+=2; //a=a+2
       System.out.println(a);
       int b = 5;
       b+=a;//b = b + a
       System.out.println(b);
       System.out.println("------------");
       //1���� 20���� ¦���� ���� ���Ͻÿ�.
       int sum = 0;
       for (int i = 1; i < 21; i++) { //�ܶ�, Block
		if(i%2==0) {
			System.out.println(i);
			sum +=i; //sum = sum + i;
		} // if
		} //for
	System.out.println("sum : " + sum);
	}
}
