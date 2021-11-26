package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	//main method
	public static void main(String[] args) {

		//File�� �о���̴� Stream ����
		FileReader fr = null;
		//read() �� count ���� ����
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
		} catch (FileNotFoundException e) { //��Ÿ�� �� ����
			e.printStackTrace();
		} catch (IOException e1) { //�дٰ� ���� �� ���� 
			e1.printStackTrace();
		} finally {
			System.out.println("\n\n===========================================");
			System.out.println("==============>> read Ƚ�� : readCount : "+readCount);
			System.out.println("===========================================");
			try {
				//fr null�� �ƴ� ��쿡�� close�ϵ���!
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
