package com.cocea.lesson.object;//클래스를 가지고 있는 폴더

public class Obj_1 {
	
	String you ="문자열";//부모가 소유하고 있는 재산
	int y = 5;

	public static void main(String[] args) {
		// 특별이유가 없으면 항상 여기서 프린트
		Obj_1 munja/*객체명 커맨드*/ = new Obj_1();//사물1을 생성
		Obj_1 nums = new Obj_1();//사물2를 생성
		//사물들은 부모에게 2가지를 물려받음("문자열" 과 5)
		System.out.println(munja.you);
		System.out.println(nums.y);
//inherit
	}

}
