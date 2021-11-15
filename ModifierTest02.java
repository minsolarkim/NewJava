
/*	==>TopSecret.class�� ������
	- : secretNo�� �߿��� attribute�̴�. �׷��� ������ ���� �� ������ ����
	==>Access Modifier�� ���� information hiding�� Method(����)�� ���� ����
*/

class TopSecret02 {

	//Field
	//==>access modifier�� Ȱ���� information hiding
	//==>private ������� ����Ͽ� ���� ������ �� ������ �ϰ� getter Method ���� ����
	private int secretNo = 7777;	//private�� ������

	//Constructor
	public TopSecret02(){			//������ �ݰ� �ۿ� ����
	}

	//Method
	//getter Method
	//==> method�� ���� ������ ������ ��츸 secretNo�� return
	publid int getSecretNo(int pwd){
		if ( pwd == 0 ) {
			return secretNo;		//this.secretNo �����Ȱ���
		} else {
			return 0;
		}//end of if
	}//end of method

}//end of class


public class ModifierTest02 {
	//main method
	public static void main(String[] args) 	{

		TopSecret02 topSecret = new TopSecret02();

		//==> private Field�� information hiding�� �Ǿ� �־� ���� �� ������ �Ұ�
		//==> Method�� ���� ���ٸ� ���� / ����Ұ�
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo = 1234;

		System.out.println( topSecret.getSecretNo(0) );

	}//end of main

}//end of class