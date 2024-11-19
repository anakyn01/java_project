package com.cocea.lesson.tutorial;

public class IfElse {

	public static void main(String [] args) {
		//만일 무엇이라면 (userID != null)
		if (20 > 18) {
			System.out.println("20은 18보다 크다");
		}
		
		//변수테스트
		int x = 20;
		int y = 18;
		if (x < y) {
			System.out.println("x는 y보다 크다");
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
		
		//단축형 Ternary Operator 삼항연산자
		//syntax variable = (condition) ? expressionTrue : expressionFalse;
		int time_2 = 20;
		String rs = (time_2 < 18) ? "Good day." : "Good evening.";
		System.out.println(rs);
	}
}
/*
Conditions and if Statements
if : 지정된 조건이 참인 경우 실행할 코드 블록을 지정하는 데 사용
if(condition){
}

else : 동일한 조건이 거짓인 경우 실행할 코드 블록을 지정하는 데 사용
syntax
if(condition){
//거짓
}else{
//true 이거나 대체하는 걸..
}

else if : 첫 번째 조건이 거짓인 경우 테스트할 새 조건을 지정하는 데 사용
syntax
if(condition1){
} else if (condition2){
} else{
}











*/
