package com.cocea.lesson.object;

//�߻� Ŭ����
abstract class Animal_2{
	
	//Animal_2 ani = new Animal_2() ; �߻�Ŭ�������� ��ü�� �����Ҽ� ����
	//�߻�޼��� �ٵ� ������ ����
	public abstract void animalSound();
	//�Ϲݸ޼���
	public void sleep() {
		System.out.println("Zzz");
	}	
}
//subclass (inherit from Animal_2)
class Dogs extends Animal_2{
//extends ����Ѵٴ� Ű����
	/*@Override ������
	public void animalSound() {
		System.out.println("The dogs says: �� ��");
		
	}*/
	
	public void animalSound() {
		System.out.println("The dogs says: �� ��");
	}
	
}


public class Abs {

	public static void main(String[] args) {
		
Dogs dogs/*��ü���� ����°� Ŀ���*/ = new Dogs(); //��ü ����
dogs.animalSound();		
dogs.sleep();	
		
String ss="�߻�޼��带 ����ؾ� �Ǵ� ���� �� �ñ� : ���Ȱ�ȭ�� �Ϸ��� Ư������������ ����� ��ü�� �߿��� ���������� ǥ���ϼ���";		
		
String abstraction ="�߻�Ŭ������ �޼���\n"+
"������ �߻�ȭ �� Ư�� ���� ������ ����� ����ڿ��� �ʼ����� ������ �����ִ� ���μ����Դϴ�\n"+
"�����Ϳ� �߻�ȭ�� �߻�Ŭ���� �Ǵ� �������̽��� �޼��Ҽ� �ֽ��ϴ�\n"+
"spring [model{dao(sql) => service(������ �߻�ȭ�� �����)}, controller(������ �߻�ȭ�� ���񽺸� ��Ʈ�ѷ����� �����ͼ� �����մϴ�), view => mvc]\n"+
"������ �߻�ȭ�� �ٵ� ������ �ʴ´�\n"+
"�߻� Ŭ����: ��ü�� �����ϴ� �� ����� �� ���� ���ѵ� Ŭ�����Դϴ�\n"+
"�߻� �޼���: �߻� Ŭ���������� ����� �� ������, ������ �����ϴ�, ������ ���� Ŭ����(��ӵ�)���� �����˴ϴ�\n"+
"�߻� Ŭ�������� �߻� �޼���� �Ϲ� �޼��� ��� ������ �ֽ��ϴ�\n"+
"Ű���� abstract�� Ŭ������ �޼��忡 ���Ǵ� �񿢼��� ������ �Դϴ�";
System.out.println(abstraction);

	}

}