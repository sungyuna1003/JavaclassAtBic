package ch04;

public class Ex6 {

	public static void main(String[] args) {
/*1~20상의 숫자중에서 3,6,9 게임의 숫자는 짝으로 표시하시오.
 * 1 2 짝 4 5 짝 7 8 짝 10 11 12 13 짝... 20
 * Hint: %이용
 **/
	for (int i = 1; i < 21; i++) {
		int j = i%10;
	if(j==3||j==6||j==9) {
		System.out.println("짝  ");
	}else {
		System.out.println(i+"  ");
	  }
	}
	}}
	
