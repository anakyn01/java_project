package com.cocea.lesson.object;

class Cow {
	public void animalSound() {//�����Ҹ� �Լ��� �Ļ�
		System.out.println("����");
	}
}

class Dog extends Cow{
	public void animalSound() {//�����Ҹ� �Լ��� �Ļ�
		System.out.println("�۸�");
	}
}

class Rabit extends Cow{
	public void animalSound() {//�����Ҹ� �Լ��� �Ļ�
		System.out.println("�� �Ҹ��� �����");
	}
}


public class Poly {

	public static void main(String[] args) {
		// ���� Ŭ�������� �Ļ��� �ٸ� Ŭ������ ����Ŭ���� cow�� ��ü���� �����ν� �׼Ӽ����� ��üȭ ���� ��ӹ޾� ���
		Cow myCow = new Cow();
		Cow myDog = new Dog();
		Cow myRabit = new Rabit();
		
		myCow.animalSound();
		myDog.animalSound();
		myRabit.animalSound();
		
		
		System.out.println("�������� ����Ͽ� �ڵ差�� ���̰� ����� �����Ͽ���");
				
String Dec = "�ڹ� ������\n"+
"�������̶� '���� ���¸� �ǹ� �մϴ�[����� ���� ���õ� ���� Ŭ������ ������ �߻����� �ǹ��մϴ�]' \n"+
"����� �޾Ƽ� ���� �۾������ �پ��� ������� �����մϴ�";
		
	}

}