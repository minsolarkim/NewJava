class Example2
{
	public static void main(String[] args) 
	{
		int dan = Integer.parseInt(args[0]);
		
		System.out.println(dan + "���� ����մϴ�.");

		
		//for������ 

		if (dan < 1 || dan > 9)
		{
			System.out.println("1~9������ ���� �Է����ּ���");
		} else {

		//for������ 
/*			for(int i=1; i< 10; i++){
				
				System.out.println(dan +" * "+ i + " = " + dan*i);
			}//end of for
*/
		//while������
		int i = 1;
			while( i < 10 ){ 
				System.out.println(dan + " * " + i + " = " + dan*i);
				i++;
			}
		}//end of ifElse



	}
}