package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileInputStreamTest {
	//main method
	public static void main(String[] args) {
		
		//File을 읽어들이는 Stream 선언
		FileInputStream fis = null;
		//read() 수 count 위한 변수
		int readCount = 0;
		
		try {
			fis = new FileInputStream(args[0]);
			
			Reader r = new InputStreamReader(fis);
			
			while(true) {
				int i = r.read();
				
				if (i == -1) { // i = -1의 의미는 ==> API확인할 것
					break;
				}
				
				char c = (char)i;
				System.out.print(c);
				
				readCount++;
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("\n\n===========================================");
			System.out.println("==============>> read 횟수 : readCount : "+readCount);
			System.out.println("==========================================");
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
