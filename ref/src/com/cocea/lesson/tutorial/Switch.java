package com.cocea.lesson.tutorial;

public class Switch {

	public static void main(String[] args) {
//�������� ���ƾ� �Ҷ� ����Ƽ ��� (�ڵ尡 �������� ��)
int day = 7;
switch (day) {
case 1:
	System.out.println("Mon");
	break;
case 2:
	System.out.println("Tue");
	break;
case 3:
	System.out.println("Wed");
	break;
case 4:
	System.out.println("Thur");
	break;
case 5:
	System.out.println("Fri");
	break;
default://��ü
	System.out.println("?");
}

	}

}
/*
���û����� ���� ��� ����ġ ���
syntax
switch(expression){
case x:
//code block
break

default:
//���� ���̽��� �� ���� ���� ��� ��ü
}








*/