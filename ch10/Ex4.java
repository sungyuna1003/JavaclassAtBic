package ch10;

abstract class Tv{
	//필드선언
	String color;
	boolean power;
	int ch;
	//일반매소드
	void powerOnOff() {
		power=!power;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
		if(ch<0)
			ch=0;
	}
	//추상매소드
	abstract void setModel();
}

interface RemoteControl{ //리모콘 아님, TV와 리모콘 사이 콘트롤
	void turnOn();
	void turnOff();
}

class SMTv extends Tv implements RemoteControl{

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}

	@Override
	void setModel() {
	}}
  
class LGTv extends Tv implements RemoteControl{

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}

	@Override
	void setModel() {
	}}



public class Ex4 {
	public static void main(String[] args) {

	}
}
