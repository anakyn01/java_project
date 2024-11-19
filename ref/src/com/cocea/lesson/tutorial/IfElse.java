package com.cocea.lesson.tutorial;

public class IfElse {

	public static void main(String [] args) {
		//���� �����̶�� (userID != null)
		if (20 > 18) {
			System.out.println("20�� 18���� ũ��");
		}
		
		//�����׽�Ʈ
		int x = 20;
		int y = 18;
		if (x < y) {
			System.out.println("x�� y���� ũ��");
		}else {
			System.out.println("Nop");
		}
		
		//else
		int time = 20;
		if(time < 18) {
			System.out.println("Good day");
		}else {
			System.out.println("Good evening");
		}
		
		//if else if else
		int Time = 22;
		if(Time < 10) {
			System.out.println("Good morning");
		} else if (Time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		
		//������ Ternary Operator ���׿�����
		//syntax variable = (condition) ? expressionTrue : expressionFalse;
		int time_2 = 20;
		String rs = (time_2 < 18) ? "Good day." : "Good evening.";
		System.out.println(rs);
	}
}
/*
Conditions and if Statements
if : ������ ������ ���� ��� ������ �ڵ� ����� �����ϴ� �� ���
if(condition){
}

else : ������ ������ ������ ��� ������ �ڵ� ����� �����ϴ� �� ���
syntax
if(condition){
//����
}else{
//true �̰ų� ��ü�ϴ� ��..
}

else if : ù ��° ������ ������ ��� �׽�Ʈ�� �� ������ �����ϴ� �� ���
syntax
if(condition1){
} else if (condition2){
} else{
}











*/
