package io;

import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	//main method
	public static void main(String[] args) throws Exception 	{
		
		System.out.println(args[0]);
		
		//InputStream :: 표준입력장치 추상화한 class
		InputStream inputStream = System.in;

		System.out.println("입력을 기다립니다...");

		try	{
			//값을 읽어들이는 무한 loop 시작
			while(true){
				//1. java.io는 지연(block)될 수 있다.
				int i = inputStream.read();
				char c = (char) i;

				//2. java.io는 FIFO의 구조
				System.out.println("입력하신 값 : " +c );
				
				//==> char 'x'가 입력되면 while 종료
				if(c=='x'){
					inputStream.close();
					break;
				}
				//한글입력시 깨진(?)다... 한글 1EA당 2개 생기는 것을 확인하자.
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
