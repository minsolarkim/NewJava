
/*
	Constructor �ǹ� ����
	1. �ν��Ͻ� ������ new A()�� �ǹ��� ����
	2. new�� ���� ���Ǵ� Ư���� ������ �ϴ� method ����
	3. Constructor �� �۾�, �뵵��?
	========================================
	==> �����ڴ� �ν��Ͻ� ������ ȣ��ȴ�.
	==> �� �۾��� Field variable �ʱ�ȭ �۾�(���°� ����)
	==> ������ ���¸� ���� �ν��Ͻ� ����
	========================================
	==> Method OverLoading : Method �پ��� Ȱ��
	==> Constructor Method OverLoading : Constructor Method �پ��� Ȱ��
	==> ������ �پ��� ���¸� ���� ��ü�� �����Ѵ�.
*/

public class User03 
{

	//Field
	String name;
	int javaLevel;

	//Constructor
	public User03(){
		System.out.println("���� ������");
		name = "ȫ�浿";
		javaLevel = 0;
	}

	//�ν��Ͻ� ������ name ���°��� �����ϴ� (�ʱ�ȭ) ������
	public User03(String str){
		System.out.println("���� String�� ���ڷ� �޾� name�� �ʱ�ȭ�ϴ� ������");
		name = str;
	}

	//�ν��Ͻ� ������ javaLevel ���°��� �����ϴ� (�ʱ�ȭ) ������
	public User03(int i){
		System.out.println("���� int�� ���ڷ� �޾� javaLevel�� �ʱ�ȭ�ϴ� ������");
		javaLevel = i;
	}

	//�ν��Ͻ� ������ name, javaLevel ���� �����ϴ� (�ʱ�ȭ) ������
	public User03(String str, int i){
		System.out.println("���� String, int�� ���ڷ� �޾� name, javaLevel�� �ʱ�ȭ�ϴ� ������");
		name = str;
		javaLevel = i;
	}

	//Method
	//getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(){
		return javaLevel;
	}

	//Main Method
	public static void main(String[] args) 
	{
		System.out.println("================");
		User03 user01 = new User03();
		System.out.println("name : "+user01.getName());
		System.out.println("javaLevel : "+user01.getJavaLevel());

		System.out.println("================");
		User03 user02 = new User03("ȫ���");
		//==> ���°��� �������� ���� (�ʱ�ȭ���� ����) javaLevel�� ��°���?
		System.out.println("name : "+user02.getName());
		System.out.println("javaLevel : "+user02.getJavaLevel());

		System.out.println("================");
		User03 user03 = new User03(100);
		//==> ���°��� �������� ���� (�ʱ�ȭ���� ����) name�� ��°���?
		System.out.println("name : "+user03.getName());
		System.out.println("javaLevel : "+user03.getJavaLevel());

		System.out.println("================");
		User03 user04 = new User03("�̼���", 200);
		System.out.println("name : "+user04.getName());
		System.out.println("javaLevel : "+user04.getJavaLeve());
	}//end of main

}//end of class
