package com.cocea.lesson.object;

class Visa{
	//�Ϻ��� ���� ��� => ���������̳� ����ó�� ������ ���
	protected String cocea = "�Ϻ��� ���� ���";
	public void goJapan() {
		System.out.println("�л��е� �Ϻ��� ������ ����ó�� �����糪 �������� ����ó���� ����ϼž� �ؿ�");
		//����ó�� �����糪 �������� ����ó���� ����ϼž� �ؿ�
	}
	
}

public class Nippon extends Visa{
    //���̸��� �������� �� �Ϻ��� ���ϰ� �ڹٸ� �����
	private String mytalk ="���̸��� �����Դϴ� ���� �ڹٰ� �������";
	
	public static void main(String[] args) {
		//���̸����� ��ü ����
		Nippon im = new Nippon();
		//�п����� ���ֽ� ����[�ڼ��ƿ� �ż��� ]�� ��� �����Ͽ���
		im.goJapan();
		System.out.println(im.mytalk + "���� �Ϻ��� ����Ϸ��� ��� �ؾ� �ұ��?" + im.cocea + "�������� ����ó�� ����Ͻô°� �����ϴ�");

	}

}
