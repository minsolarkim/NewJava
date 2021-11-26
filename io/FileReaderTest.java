package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	//main method
	public static void main(String[] args) {

		//File을 읽어들이는 Stream 선언
		FileReader fr = null;
		//read() 수 count 위한 변수
		int readCount = 0;
		
		try {
			fr = new FileReader(args[0]);
			
			while(true) {
				int i = fr.read();
				
				if (i == -1 ) {
					break;
				}
				
				char c = (char)i;
				System.out.print(c);
				
				readCount++;
				
			}
		} catch (FileNotFoundException e) { //오타날 수 있음
			e.printStackTrace();
		} catch (IOException e1) { //읽다가 깨질 수 있음 
			e1.printStackTrace();
		} finally {
			System.out.println("\n\n===========================================");
			System.out.println("==============>> read 횟수 : readCount : "+readCount);
			System.out.println("===========================================");
			try {
				//fr null이 아닐 경우에만 close하도록!
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
