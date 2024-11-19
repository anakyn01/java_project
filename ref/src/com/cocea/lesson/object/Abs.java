package com.cocea.lesson.object;

//추상 클래스
abstract class Animal_2{
	
	//Animal_2 ani = new Animal_2() ; 추상클래스에는 객체를 생성할수 없음
	//추상메서드 바디를 가지지 않음
	public abstract void animalSound();
	//일반메서드
	public void sleep() {
		System.out.println("Zzz");
	}	
}
//subclass (inherit from Animal_2)
class Dogs extends Animal_2{
//extends 상속한다는 키워드
	/*@Override 재정의
	public void animalSound() {
		System.out.println("The dogs says: 멍 멍");
		
	}*/
	
	public void animalSound() {
		System.out.println("The dogs says: 멍 멍");
	}
	
}


public class Abs {

	public static void main(String[] args) {
		
Dogs dogs/*객체명을 만들는걸 커멘드*/ = new Dogs(); //객체 생성
dogs.animalSound();		
dogs.sleep();	
		
String ss="추상메서드를 사용해야 되는 이유 와 시기 : 보안강화를 하려면 특정세부정보를 숨기고 객체의 중요한 세부정보만 표시하세요";		
		
String abstraction ="추상클래스와 메서드\n"+
"데이터 추상화 는 특정 세부 정보를 숨기고 사용자에게 필수적인 정보만 보여주는 프로세스입니다\n"+
"데이터에 추상화는 추상클래스 또는 인터페이스로 달성할수 있습니다\n"+
"spring [model{dao(sql) => service(데이터 추상화를 사용함)}, controller(데이터 추상화에 서비스를 콘트롤러에서 가져와서 실행합니다), view => mvc]\n"+
"데이터 추상화는 바디를 가지지 않는다\n"+
"추상 클래스: 객체를 생성하는 데 사용할 수 없는 제한된 클래스입니다\n"+
"추상 메서드: 추상 클래스에서만 사용할 수 있으며, 본문이 없습니다, 본문은 하위 클래스(상속됨)에서 제공됩니다\n"+
"추상 클래스에는 추상 메서드와 일반 메서드 모두 있을수 있습니다\n"+
"키워드 abstract는 클래스와 메서드에 사용되는 비엑세스 수정자 입니다";
System.out.println(abstraction);

	}

}
