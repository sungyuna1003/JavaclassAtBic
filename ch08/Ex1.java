package ch08;

public class Ex1 {
	public static void main(String[] args) {
       Customer lee = new Customer(1000,"이순신"); //1000은 고객ID넘버
       lee.bonusPoint = 1000; //회원가입하면 1000포인트 지급.
       lee.calcPrice(100000); //10만원 물건 삼
       System.out.println(lee.showCustomerInfo());
    		   
       lee.calcPrice(50000); 
       System.out.println(lee.showCustomerInfo());
       
       VIPCustomer jung = new VIPCustomer(100001,"정달자",2001);
       jung.bonusPoint =10000;
       int price= jung.calcPrice(2000000);
       System.out.println("실질적으로 구매한 금액:"+price);
       System.out.println(jung.showCustomerInfo());
	}
}
