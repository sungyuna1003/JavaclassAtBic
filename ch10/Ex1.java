package ch10;

//Ŭ������ Ŭ�������� �������� ���� ��Ȱ�� ����� ����� �����
interface Calc {
// �������̽����� ������ �޼ҵ�� ->�߻�޼ҵ�
	public void m(int a, int b);
}

class Function implements/* ���� */ Calc { // ��:a��� ����� ���� ���
	public void plus(int a, int b) {
	}

	@Override
	public void m(int a, int b) {
	}
}

class MyFrame implements Calc { // ��:b��� ����� ���� Ʋ
	@Override
	public void m(int a, int b) {
	}

	public void draw(int w, int h) {
	}
}

public class Ex1 {

	public static void main(String[] args) {

	}

}
