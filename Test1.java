//package jb01.test;

public class Test1 
{
	public static void main(String[] args) 
	{
		System.out.println("\n\n");
		System.out.println("나의 이름은 \"" + args[0] + "\"입니다");
		System.out.println("\"" + args[0] + "\"씨의 [hp]는 " + "\"" + args[1] + "\"입니다.");

		String name = args[0];
		String hp = args[1];
		
		//=> Java에서 문자를 나타내는 data type은 String


		System.out.println("나의 이름은 \"" + name + "\"입니다.");
		System.out.println("\""+name+"\"씨 [hp]는 \""+hp+"\" 입니다.");

	}
}
