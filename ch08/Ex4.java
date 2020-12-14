package ch08;

class Animal {
	void move() {
		System.out.println("������ �����δ�.");
	}
}

class Human extends Animal {
	@Override
	void move() {
		// ����Ŭ�������� �������̵� �� �޼ҵ� ȣ����. super.�޼ҵ�
		// super.move();
		System.out.println("����� �ι߷� �ȴ´�.");
	}
}

class Tiger extends Animal {
	@Override
	void move() {
		System.out.println("ȣ���̰� �׹߷� �ڴ�.");
	}
}

class Eagle extends Animal {
	@Override
	void move() {
		System.out.println("�������� ������ ����.");
	}
}

public class Ex4 {
	public static void main(String[] args) {
		// ������: ���� Ŭ������ ���۷��������� ����Ŭ������ �������̵� �� �޼ҵ带 �پ��ϰ� ȣ�� ������ ���¸�
		Animal ani = new Human();
		ani.move();
		ani = new Tiger();
		ani.move();
		ani = new Eagle();
		ani.move();
	}
}
