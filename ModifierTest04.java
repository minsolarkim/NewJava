
/*	1.TopSecret02.class�� �߿��� class��� modifier�� ���� ����� �� ������ ������
	2.secretNo�� readOnly�� ��Ȯ�� ��
		���� �߿��� class��� ��ü ������ �Ұ����ϰ� �Ѵ�.
		==> �Ʒ��� coding�� ��������. �����ڸ� �ܺο��� �������� ���ϰ� private ����.
		( �� > java.lang.System.class�� �ҽ��� API�� ���� Ȯ��)
	3.static method�� ���� �ν��Ͻ��� ������ �� �ֵ��� �Ѵ�.
		==> ��... ������ ������ ��츸 �ν��Ͻ��� return ��.
*/

//final modifier�� Ȱ�� ��ӺҰ�
final class TopSecret04 {

	//Field
	//==> access modifier�� Ȱ���� information hiding
	//==> final modifier�� Ȱ���� �����Ұ�
	private final int secretNo = 7777;

	//Constructor
	//==> Access modifier�� ���� ��ü�����Ұ� (private Constructor�� ����� ���� ����)
	public TopSecret04(){
	}

	//Method
	//getter Method
	//==> method�� ���� ������ ������ ��츸 secretNo�� return
	publid int getSecretNo(int pwd){
		if ( pwd == 0 ) {
			return secretNo;
		} else {
			return 0;
		}//end of if
	}//end of method

	//static method�� �̿��� instance return �ϰ��Ͽ� �ٸ� class���� ��밡���ϰ� ��.
	//==> manageNo�� ���ڷ� �޾� Instance�� return�� �� ������ �Ǵ��Ѵ�.
	public static TopSecret04 getInstance(int managerNo){
		if (managerNo == 1234)	{
			return new TopSecret04();
		} else {
			return null;
		}
	}

}//end of class


public class ModifierTest04 {

	//main method
	public static void main(String[] args) 	{

		//instance ������ �Ұ��� static method�� ���� ��ü�� return �޴´�.
		//==> ���� instance�� return �޴� ��쵵 ����(managerNo)�� �����ؾ� ��.

		TopSecret04 topSecret = TopSecret04.getInstance(1234);
		System.out.println( topSecret.getSecretNo(0) );

		//==> ModifierTest01.class ~ ModifierTest04.class���� �����ϸ鼭
		//==> Access Modifier�� Modifier�� ���, Ȱ���� ��������.

	}//end of main

}//end of class