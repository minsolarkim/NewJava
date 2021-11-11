class Example3
{
	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = 0;

		if (num1 < num2)
		{
			for(int i = num1; i<=num2; i++){
			sum += i;
			}
			System.out.println("sum : "+sum);
		} else if (num1 > num2)
		{
			for(int i = num2; i <= num1; i++){
			sum += i;
			}
			System.out.println("sum : "+sum);		
		} else if (num1 == num2)
		{
			System.out.println("입력값이 같습니다.");
		}
		
		
	}
}
