package com.cocea.lesson.tutorial;

public class Switch {

	public static void main(String[] args) {
//선택지가 많아야 할때 스위티 사용 (코드가 지저분해 짐)
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
default://대체
	System.out.println("?");
}

	}

}
/*
선택사항이 많을 경우 스위치 사용
syntax
switch(expression){
case x:
//code block
break

default:
//위에 케이스가 다 맞지 않을 경우 대체
}








*/
