
/*
	1. OOP : Message
	2. OOPL : Method
	- ��ü���� ������ �����ϴ� Method ����
	- OOP���� Message(Method)�� ��ü�� data�� ���� �Ǵ� ���� �� �ִ� ����.
	- OOP�� ��ü�� Message �������� �ʿ��� �����͸� �ѱ�ų� ��� ����Ÿ�� ���� �� �ִ�.
	- OOP�� ��ü�� ��ü�� ����� method ȣ��
*/
class MethodSyntax
{
	//Field
	String name = "ȫ�浿";
	String add = "�Ѿ�";

	//Method
	//==> �������� �Ѵ� ���� ����
	public void browerOn(){
		System.out.println("brower�� �Ѵ�");
	}

	//==> �۾��� �ϰ� �۾������� boolean type���� return �ϴ� ����
	public boolean documentWork(){
		System.out.println("document�۾��� �ϰ� �۾��ϼ� ������ boolean return");
		return true;
	}

	//==> �� ���� ������ �޾� ���� return  �ϴ� ����
	public int sum(int i, int j){
		System.out.println("<<"+i+">> �� <<"+j+">>���� �޾� �� return");
		return(i+j);
	}

	//==> �̸��� return�ϴ� ����
	public String getName(){
		System.out.println("�̸��� �����մϴ�.");
		return name;
	}

	//==> �ּҸ� return�ϴ� ����
	public String getAdd(){
		System.out.println("�ּ��� �����մϴ�.");
		return add;
	}

	//==> �̸�, �ּ� �ΰ��� ����(���°�)�� Array DataType return �ϴ� ����
	public String[] getAllInformation(){
		String[] str = { name, add };
		return str;
	}

}//end of class
