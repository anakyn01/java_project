package com.cocea.lesson.object;

class Legacy{
	//���� ������ �ִµ� 3�� ��ӹ޴� ������Ը� �ʿ�
	protected int legacyMoney = 3;//1)����
	//�ʿ��� ������ �����ٲ� �޼���
	public void myTalk() {//2)������
		System.out.println("���� �װŵ� �ʿ��� ������� �����ָ�");
	}
}

public class Monney extends Legacy{

	private String iam ="���� ������ �峲�̴�";
	//�� �θ�Կ� �峲
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//�θ�Կ��� 3���� ��������	
		Monney myfirst = new Monney();///�峲���� �����ϰ�
		myfirst.myTalk();//���� �������� ��� ����
		
		System.out.println("�ٸ� �������� �������� ������");
		System.out.println("���� ��ӹ��� ���� �󸶳��� " + myfirst.legacyMoney + "�̴�");


	}

}
