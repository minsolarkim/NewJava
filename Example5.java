class Example5 
{
	public static void main(String[] args) 
	{
		int[][] text = new int[9][9];

		for (int i=0; i < text.length; i++ )
		{
			text[i] = i+1;
			for (int j=0; j < text[i].length; j++)
			{
				text[i][j] = j+1;
				System.out.println(text[i] + " * " + text[i][j] + " = " + text[i]*text[i][j]);
			}
		}

		System.out.println("Hello World!");
	}
}
