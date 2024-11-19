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
	String st1 = "���ڿ� ����";
	class St2{
		String st2 = "�� �Ҽ� ";
		class St3{
			String st3 = " �ֽ��ϴ�";
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

		String inner ="�ڹ� ���� Ŭ������ \n"+
"Ŭ���� ���� Ŭ����(��ø)\n"+
"��ø Ŭ������ ������ �Բ� ���ϴ� Ŭ������ �׷�ȭ �ϴ°��̸�\n"+
"�̸� ���� �ڵ带 �� �б� ���� ���������ϱ� ���� ����ϴ�";

	}

}
