package com.cocea.lesson.object;

class Parent{
	protected String brand = "ford";//��ӽ�Ű�� Ŭ���������� protected���
	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

public class Inherit extends Parent {//Ŭ���� Inherit �θ�Ŭ���� Parent���� ��ӹ޴´�
    private String modelName = "Mustang";
	
	public static void main(String[] args) {
		
	Inherit myCar = new Inherit();//��ü�� ����
	
	myCar.honk();//����� �޾Ƽ� �θ� �ż��带 ����Ҽ� ����
	
	System.out.println(myCar.brand + " " + myCar.modelName);
		
String inherritance ="�� Ŭ�������� �ٸ� Ŭ������ �Ӽ��� �޼��带 ���\n"+
"�� Ŭ�������� �ٸ� Ŭ������ �Ӽ��� �޼��带 ���\n"+
"����Ŭ���� (�θ�) =>  ����� ��Ű�� Ŭ����\n"+
"���� Ŭ���� (�ڽ�) => �θ�Ŭ������ ��ӹ޴� Ŭ����\n"+
"Ŭ�������� ����Ϸ��� extends Ű���带 ����մϴ�.\n"+
"����� ����ؾ� �ϴ� ������ �ñ�\n" +
"�ڵ� ���뿡 �����մϴ�\n"+
"�� Ŭ������ ���鶧 ���� Ŭ������ �Ӽ��� �޼��带 ���� �մϴ�\n"+
"��ӵ� �޼���� �پ��� �۾��� �����ϴ°��� ������ �Դϴ�";
	}

}