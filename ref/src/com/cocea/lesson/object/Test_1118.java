package com.cocea.lesson.object;

//1) 상속(서브클래스[자식]와 슈퍼클래스[부모]), protected


class Tell{
	protected String brand = "전화기";
	public void tell() {
		System.out.println("무시 무시");
	}
}
//2) 다형성("여러 형태를 의미함") 상속을 통해서 서로관련된 여러 클래스가 있을때 발생합니다





class Spring{
	public void myDesc() {
		System.out.println("spring은 java server page에 프레임 워크입니다");
	}
}
class FrontEnd extends Spring{
	public void myDesc() {
		System.out.println("앞단이라고 하며 다이나믹하게 동적으로 움직이는 상태에 페이지들");
	}
}
class BackEnd extends Spring{
	public void myDesc() {
		System.out.println("뒷단이라고 하며 프로그래밍에서 원하는대로 작동을 시켜주는 모델");
	}
}


//3) 중첩클래스 객체화 하고 커맨드로 객체, 커멘드로 객체화 한걸 또 객체
class OutClass{
	int x = 10;//1
	class MidClass{//2
		int y = 5;
		class Thr{//3
			int z = 8;
		}
	}
}

//4) 추상클래스 : 특정 세부 정보를 숨기고 사용자에게 필수적인 정보만 보여주는 프로세스 abstract키워드 사용
abstract class JAVA{
	public abstract void javaSound();
	public void java_sleep() {
		System.out.println("자바한다고 하면서 진짜 자바하시면 안되요");
	}
}
class Sleep extends JAVA{
	public void javaSound() {
		System.out.println("개발할거에용 앙");
	}
}

//5) 추상클래스에 또다른 방법 인터페이스 (실무에서 주로 사용하는 방법 spring lagacy, boot)
interface Service{
	public void serviceSound();
}
class ServiceImpl implements Service{
	public void serviceSound() {
		System.out.print("실제 비즈니스 로직이 흐르는곳");
	}
	public void Controller() {
		System.out.print("어노테이션 오토와이어드로 서비스 컴포넌트 모듈로 등록");
	}
}



public class Test_1118 extends Tell{

   
	//tell attribute
	private String modelName ="070 전화기";
	
	public static void main(String[] args) {
		
		//ServiceImpl
		ServiceImpl controller = new ServiceImpl();
		controller.Controller();
		controller.serviceSound();
		System.out.print("그래서 콘트롤러인 내가 서비스에서 받은걸 view에 뿌려줍니다");
		//abstract
		Sleep myDevelope = new Sleep();//상속하는 클래스가 아니라 확장된 상속받은 클래스로 객체를 만듬
		myDevelope.javaSound();
		myDevelope.java_sleep();//상속받은 메서드는 상속시킨 클래스에 메소드명과 일치해야함
		
		//중첩클래스를 사용할때에 장점 상하관계를 직관적으로 확인 할수 있다
		//중첩클래스안에 private을 선언하면 에러가 발생한다
	    OutClass first = new OutClass();
	    OutClass.MidClass second = first.new MidClass();
	    OutClass.MidClass.Thr three = second.new Thr();
	    
	    System.out.println(first.x + second.y + three.z);
		
		//다형성 => 상속받는 클래스들이 같은 메서드 호출로 각각 다른값을 사용함
		Spring spring = new Spring();
		Spring frontEnd = new FrontEnd();
		Spring backEnd = new BackEnd();
		
		spring.myDesc();
		frontEnd.myDesc();
		backEnd.myDesc();
		
		//클래스명 자신으로 객체를 만듬
		Test_1118 test = new Test_1118();
		test.tell();

		System.out.println(test.brand +  " " + test.modelName);
	}

}
