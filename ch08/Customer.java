package ch08;

//메인은 필요없음. 실행하는 것 만들지 않기 때문
public class Customer {

	public  int customerID;
	public String customerName;
	public String customerGrade;
	public int bonusPoint;
	public double bonusRatio;

//    생성자:객체가 생성될 때, 기본적인 값을 세팅을 목적으로 한다.
//	객체를 생성할 때 한번만 호출하고, 다른 메소드처럼  반복적인 호출은 불가능
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%
	}// ^위 첫번째 생성자: 아이디도, 이름도 없는 경우

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%
	}// ^위 두번째 생성자: 아이디도, 이름도 있는 경우

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
//만약 물건을 10만원치 사고, 보너스는 천원. bonunsPoint 만원 원래 있었다면 값은 만백원이 적립.
		return price;
	}

	public String showCustomerInfo() {
		String str = customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "입니다.";
		return str;
	}
}
