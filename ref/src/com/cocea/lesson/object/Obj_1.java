package com.cocea.lesson.object;//Ŭ������ ������ �ִ� ����

public class Obj_1 {
	
	String you ="���ڿ�";//�θ� �����ϰ� �ִ� ���
	int y = 5;

	public static void main(String[] args) {
		// Ư�������� ������ �׻� ���⼭ ����Ʈ
		Obj_1 munja/*��ü�� Ŀ�ǵ�*/ = new Obj_1();//�繰1�� ����
		Obj_1 nums = new Obj_1();//�繰2�� ����
		//�繰���� �θ𿡰� 2������ ��������("���ڿ�" �� 5)
		System.out.println(munja.you);
		System.out.println(nums.y);
//inherit
	}

}