class ArrayTest02 
{
	public static void main(String[] args) 
	{
		//int Data Type�� �迭�� �迭(2���� �迭)�� ����
		int[][] value = new int[9][9];

		//index�� �̿� value�� �� ���� �� ����
		for(int i=0; i<9; i++){
			value[0][i] = 1 * (i+1);
		}

		//�� �� �����غ���
		for(int i = 1; i < value.length; i++){
			for(int j=0; j < value[i].length; j++){
				value[i][j] = i * (j+1);
			}//innerFor
		}//outerFor




		//�Էµ� ���� ���
		//==> value.length / value[j].length�� �ǹ̸� ����
		//==> valeue[0][0] ~ value[0][9]������ ��°��� Ȯ��
		//==> �� �̿� ������? (<== �迭�� ������ �ڵ� �ʱ�ȭ���� Ȯ��.)
		for(int j=0; j<value.length; j++){

			System.out.println("======================");

			for(int k=0; k<value[j].length; k++){

				System.out.println("value["+j+"]["+k+"] = "+value[j][k]);

			}//end of innerFor

		}//end of outerFor
		
		System.out.println("======================");

	}//end of main()
}//end of class