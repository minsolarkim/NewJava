
/* 1.ModifierTest01, ModifierTest02, ModifierTest03, ModifierTest04�� ����
	class ������ Modifier / Access Modifier ��� Ȱ��, ����Ǵ��� ���캸��...
   2. TopSecret01.class�� Access Modifier�� ��� �����Ű������ ����
*/

class TopSecret01 {

	//Field
	int secretNo = 7777;

	//Constructor
	public TopSecret01(){
	}

	//Method
	//getter Method
	publid int getSecretNo(){
		return secretNo;
	}

}//end of class


public class ModifierTest01 {
	//main method
	public static void main(String[] args) 	{

		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secretNo);

		//==> secretNo �����ϸ�...
		topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo());

	}//end of main

}//end of class

/*	TopSecret.class�� ������
	- : secretNo�� �߿��� attribute�̴�. �׷��� ������ ���� �� ������ ����
*/