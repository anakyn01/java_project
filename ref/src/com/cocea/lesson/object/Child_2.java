package com.cocea.lesson.object;

class YoungBrother implements Brother{
	public void brotherSound() {System.out.println("�谡 ������");}
	/*public static void main(String[] args) {
		System.out.println("�谡 �����ٴϱ�");
	}*/
}

public class Child_2 {//�����Ʈ�� ó�� ������ Ŭ���������� ����ϴ°��� ����
	//�����Ʈ�� Ŭ������ ������ �̸������� ������ ������

	public static void main(String[] args) {
		YoungBrother youngBrother = new YoungBrother();
		youngBrother.brotherSound();

	}

}