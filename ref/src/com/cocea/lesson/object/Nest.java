package com.cocea.lesson.object;

class OuterClass{//1
	int x = 10;
	
	class InnerClass{//2
		int y = 5;
		
		class ThreeClass{//3
			int q = 11;
		}
	}
}


class St1{
	String st1 = "문자열 끼리";
	class St2{
		String st2 = "더 할수 ";
		class St3{
			String st3 = " 있습니다";
		}
	}
}

public class Nest {

	public static void main(String[] args) {
		
		OuterClass myOne = new OuterClass();
		OuterClass.InnerClass myTwo = myOne.new InnerClass();
		OuterClass.InnerClass.ThreeClass mythree = myTwo.new ThreeClass();
		
		System.out.println(myOne.x + myTwo.y + mythree.q);
		
		St1 s1 = new St1();
		St1.St2 s2 = s1.new St2();
		St1.St2.St3 s3 = s2.new St3();
		System.out.println();

		String inner ="자바 내부 클래스란 \n"+
"클래스 내의 클래스(중첩)\n"+
"중첩 클래스의 목적은 함께 속하는 클래스를 그룹화 하는것이며\n"+
"이를 통해 코드를 더 읽기 쉽고 유지관리하기 쉽게 만듭니다";

	}

}
