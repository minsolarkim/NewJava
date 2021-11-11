class MethodSyntaxTestApp
{
	public static void main(String[] args) 
	{
		//MethodSyntax.class�� ��� (Instance ���� :: new ������ ���)
		MethodSyntax methodSyntax = new MethodSyntax();

		//methodSyntax �ĺ����� ���� Instance�� method�� .�����ڷ� ���� ���
		System.out.println("\n=============================");
		methodSyntax.browerOn();

		System.out.println("\n=============================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc�۾����� : "+result);

		System.out.println("\n=============================");
		int value = methodSyntax.sum(1,1);
		System.out.println("��� �����(���� ���) : "+value);
		//==> ���� �� ������ �Ʒ��� ���� ǥ���ߴ�. �ּ�Ǯ�� ��°���� Ȯ���ϸ�...
		//System.out.println("��� �����(���� ��� X) : "+methodSyntax.sum(1,1));

		System.out.println("\n=============================");
		String name = methodSyntax.getName();
		System.out.println("Field ���� name (���� ���): "+name);
		//==> ���� �� ������ �Ʒ��� ���� ǥ���ߴ�. �ּ�Ǯ�� ��°���� Ȯ���ϸ�...
		//System.out.println("��� �����(���� ��� X) : "+methodSyntax.getName());

		System.out.println("\n=============================");
		String add = methodSyntax.getAdd();
		System.out.println("Field ���� add (���� ���): "+add);
		//System.out.println("��� �����(���� ��� X) : "+methodSyntax.getAdd());

		System.out.println("\n=============================");
		String[] info= methodSyntax.getAllInformation();
		System.out.println("Field ������ ��� ���");
		
		for (int i=0; i<info.length; i++ )
		{
			System.out.println((i+1) + "��° ���� : "+info[i]);
		}
		
	}
}