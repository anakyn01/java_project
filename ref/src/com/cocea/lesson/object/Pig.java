package com.cocea.lesson.object;

class Animal{//super class
	protected String sound = "������ ������ �Ҹ��� �־��";
	public void self() {
		System.out.println("������ �۸�, ������ �ܲ�");
	}
}

public class Pig extends Animal{//child class
        //0)�������� �ʵ�
	//�������� ���� ���ڿ� �����Ҹ� = �� �����ϱ� �ܱ�
	private String selfSound  = "�� �����ϱ� �ܲ�";
	
	public static void main(String[] args) {
		//1)��ü ����
		Pig iamPig = new Pig();
		//2)��ü�� ��ӹ��� �޼���
		iamPig.self();
		//3)�θ�Ŭ���� sound, + �������� �ʵ� �ΰ��� ���
System.out.println(iamPig.sound + " " + iamPig.selfSound);
	}

}
