package com.cocea.lesson.object;

interface AniMal_3{
	public void animalSound();//바디가 없는 구현체
	public void sleep();
}

//인터페이스에서 상속받는 클래스 
class PigImpl implements AniMal_3{
	

	public void animalSound() {
		System.out.println("돼지는 꿀꿀");//body
	}

	public void sleep() {
		System.out.println("zzz");
	}
}

public class Test {

	public static void main(String[] args) {
		PigImpl pigImpl = new PigImpl();//객체생성
		pigImpl.animalSound();
		pigImpl.sleep();
	}

}
