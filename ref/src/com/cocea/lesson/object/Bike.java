package com.cocea.lesson.object;

class Rider{
	protected int price= 300;
	public void talk() {
		System.out.println("�� �����ѵ�");
	}
}

public class Bike extends Rider {
    //�ʵ�
	private int bikePrice = 100;
	
	public static void main(String[] args) {
		// ������̿� ��ӹ������� ��ӹ޴� ���� ������� ��ü�� ����
		//Ŭ������ ��ü�� ����� ���� ���ø�
		Bike myBike = new Bike();
		//��ü���� ����Ŭ�������� ��ӹ��� attribute�� method�� ���
	    myBike.talk();//��ü��.��ӹ��� �ż��� ��
	    //protected int price= 300; ��ӹ���
		System.out.println(myBike.price + " " + myBike.bikePrice );
//��ü
	}

}
