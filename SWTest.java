class SWTest 
{
	public static void main(String[] args) 
	{
		int t = 3;
		int out;
		int outPrint = 0;
		out = (t > 2) ? 10 : 9;
		for(int i = 0; i < out; i++) {
			t += i;
			if (t > 10)
			{
				outPrint += i;
			}
			i++;
		}
		System.out.println(outPrint);
	}
}
