package ch08;

//상위클래스의 생성자 메소드는 상속X.
public class VIPCustomer extends Customer { // VIP고객의 상위클래스는 Customer

//VIPCustomer: 전담판매원, 포인트비율 5%, 세일 10%
	public int agentID;
	public double saleRatio;

	public VIPCustomer() {

		// super Ctrl+space 두번째 클릭
		customerGrade = "VIP";// 상속.
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
//		this.customerID = customerID;
//		this.customerName = customerName;
		super(customerID, customerName);
		customerGrade = "VIP";// 상속.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	/*메소드 오버라이딩(Override), 상위 클래스가 숨겨져있음. 부모가 선언한 메소드를 자식클래스에서 본인에 맞게 재정의하는 것.
	 *  @Override 있어도 되고 없어도 됨. @:어노테이션(Annotation)>알림,공지*/

	public int calcPrice(int price) {
//	calcPrice 1가 에러 안나려면override 지우면 가능
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // 90만원으로 결제
//	일반고객과 다른 것은 없기 때문에 상속 가능.
	}
}
