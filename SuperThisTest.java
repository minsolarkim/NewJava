
/*
	������ Method, Field ȣ���� �� �ִ� �����(keyword) super
	������ Method, Field ȣ���� �� �ִ� �����(keyword) this
*/

class JuniorHighSchool {
	//Field
	String name = "���ѹα����б�";

	//Constructor
	public JuniorHighSchool(){
	}

	//Method
	public void schoolName(){
		System.out.println("���б� �̸� : "+name);
	}

}//end of class

class HighSchool extends JuniorHighSchool {
	//Field 
	String name = "���ѹα�����б�";

	//Constructor
	public HighSchool(){
	}

	//Constructor O/R
	public HighSchool(String str){
		name = str;
	}
	//==> ���� �����ڿ� �Ʒ��� �����ڸ� readability ���鿡�� ���캸��...
	//public HighSchool(String name){
	//	this.name = name;
	//}

	//Method
	public void schoolName(){
		System.out.println("���б� �̸� : "+super.name);
		System.out.println("����б� �̸� : "+this.name);
		System.out.println("����б� �̸� : "+name);
	}
}//end of class

public class SuperThisTest {

	public static void main(String[] args) {

		HighSchool hs01 = new HighSchool();
		hs01.schoolName();
		System.out.println("==================");

		HighSchool hs02 = new HighSchool("�������б�");
		hs02.schoolName();

	}//end of main

}//end of class
