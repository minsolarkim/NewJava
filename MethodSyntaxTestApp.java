class MethodSyntaxTestApp
{
	public static void main(String[] args) 
	{
		//MethodSyntax.class를 사용 (Instance 생성 :: new 연산자 사용)
		MethodSyntax methodSyntax = new MethodSyntax();

		//methodSyntax 식별성을 갖는 Instance의 method를 .연산자로 접근 사용
		System.out.println("\n=============================");
		methodSyntax.browerOn();

		System.out.println("\n=============================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc작업유무 : "+result);

		System.out.println("\n=============================");
		int value = methodSyntax.sum(1,1);
		System.out.println("계산 결과값 : "+value);
		//==> 위의 두 라인을 아래와 같이 표현했다. 주석풀고 출력결과를 확인하면...
		//System.out.println("계산 결과값 : "+methodSyntax.sum(1,1));

		System.out.println("\n=============================");
		String name = methodSyntax.getName();
		System.out.println("Field 정보 name: "+name);
		//==> 위의 두 라인을 아래와 같이 표현했다. 주석풀고 출력결과를 확인하면...
		//System.out.println("계산 결과값 : "+methodSyntax.getName());

		System.out.println("\n=============================");
		String add = methodSyntax.getAdd();
		System.out.println("Field 정보 add: "+add);
		//System.out.println("계산 결과값 : "+methodSyntax.getAdd());

		System.out.println("\n=============================");
		String[] info= methodSyntax.getAllInformation();
		System.out.println("Field 정보를 모두 출력");
		
		for (int i=0; i<info.length; i++ )
		{
			System.out.println((i+1) + "번째 정보 : "+info[i]);
		}
		
	}
}
