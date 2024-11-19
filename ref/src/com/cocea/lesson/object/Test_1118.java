package com.cocea.lesson.object;

//1) ���(����Ŭ����[�ڽ�]�� ����Ŭ����[�θ�]), protected


class Tell{
	protected String brand = "��ȭ��";
	public void tell() {
		System.out.println("���� ����");
	}
}
//2) ������("���� ���¸� �ǹ���") ����� ���ؼ� ���ΰ��õ� ���� Ŭ������ ������ �߻��մϴ�





class Spring{
	public void myDesc() {
		System.out.println("spring�� java server page�� ������ ��ũ�Դϴ�");
	}
}
class FrontEnd extends Spring{
	public void myDesc() {
		System.out.println("�մ��̶�� �ϸ� ���̳����ϰ� �������� �����̴� ���¿� ��������");
	}
}
class BackEnd extends Spring{
	public void myDesc() {
		System.out.println("�޴��̶�� �ϸ� ���α׷��ֿ��� ���ϴ´�� �۵��� �����ִ� ��");
	}
}


//3) ��øŬ���� ��üȭ �ϰ� Ŀ�ǵ�� ��ü, Ŀ���� ��üȭ �Ѱ� �� ��ü
class OutClass{
	int x = 10;//1
	class MidClass{//2
		int y = 5;
		class Thr{//3
			int z = 8;
		}
	}
}

//4) �߻�Ŭ���� : Ư�� ���� ������ ����� ����ڿ��� �ʼ����� ������ �����ִ� ���μ��� abstractŰ���� ���
abstract class JAVA{
	public abstract void javaSound();
	public void java_sleep() {
		System.out.println("�ڹ��Ѵٰ� �ϸ鼭 ��¥ �ڹ��Ͻø� �ȵǿ�");
	}
}
class Sleep extends JAVA{
	public void javaSound() {
		System.out.println("�����Ұſ��� ��");
	}
}

//5) �߻�Ŭ������ �Ǵٸ� ��� �������̽� (�ǹ����� �ַ� ����ϴ� ��� spring lagacy, boot)
interface Service{
	public void serviceSound();
}
class ServiceImpl implements Service{
	public void serviceSound() {
		System.out.print("���� ����Ͻ� ������ �帣�°�");
	}
	public void Controller() {
		System.out.print("������̼� ������̾��� ���� ������Ʈ ���� ���");
	}
}



public class Test_1118 extends Tell{

   
	//tell attribute
	private String modelName ="070 ��ȭ��";
	
	public static void main(String[] args) {
		
		//ServiceImpl
		ServiceImpl controller = new ServiceImpl();
		controller.Controller();
		controller.serviceSound();
		System.out.print("�׷��� ��Ʈ�ѷ��� ���� ���񽺿��� ������ view�� �ѷ��ݴϴ�");
		//abstract
		Sleep myDevelope = new Sleep();//����ϴ� Ŭ������ �ƴ϶� Ȯ��� ��ӹ��� Ŭ������ ��ü�� ����
		myDevelope.javaSound();
		myDevelope.java_sleep();//��ӹ��� �޼���� ��ӽ�Ų Ŭ������ �޼ҵ���� ��ġ�ؾ���
		
		//��øŬ������ ����Ҷ��� ���� ���ϰ��踦 ���������� Ȯ�� �Ҽ� �ִ�
		//��øŬ�����ȿ� private�� �����ϸ� ������ �߻��Ѵ�
	    OutClass first = new OutClass();
	    OutClass.MidClass second = first.new MidClass();
	    OutClass.MidClass.Thr three = second.new Thr();
	    
	    System.out.println(first.x + second.y + three.z);
		
		//������ => ��ӹ޴� Ŭ�������� ���� �޼��� ȣ��� ���� �ٸ����� �����
		Spring spring = new Spring();
		Spring frontEnd = new FrontEnd();
		Spring backEnd = new BackEnd();
		
		spring.myDesc();
		frontEnd.myDesc();
		backEnd.myDesc();
		
		//Ŭ������ �ڽ����� ��ü�� ����
		Test_1118 test = new Test_1118();
		test.tell();

		System.out.println(test.brand +  " " + test.modelName);
	}

}