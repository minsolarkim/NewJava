package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*	==>FileCopy�ϴ� Application �ۼ�
 * 	1. Keyboard�� FileName�� �Է�
 * 	2. File�� ������ read() ==> FileReader
 *  3. File�� ������ write() ==> FileWriter
 * */
public class FileWriterTestFilter01 {
	//main method
	public static void main(String[] args) throws IOException {
		
		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";
		
		int readCount = 0; //read�� count�ϱ� ���� ����
		
		System.out.print("copy�� file�̸��� �Է��ϼ��� : ");
		//copy�� FileName�� �Է¹ޱ�...
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
//														    ��1.Ű����� �Է¹޾ƿ���
//											��2.��� �а� ���� �� �����ϱ� Reader�� �ٲ��ֱ�
//						��3.���� �ϳ��� ������ ��ĵ �ʹ� ���� �ϴϱ� line���� �о��ֱ�
		
		//==>�������� Data�� read�� �� �ִ� BufferedReader ����
		br = new BufferedReader( new FileReader( fileName ));

		
		//==>�纻���� �̸� �����
		copyFileName = fileName + "_copy2";
		//==>Data�� write�� �� �ִ� BufferefWriter ����
		bw = new BufferedWriter( new FileWriter(copyFileName) );
//										��1.���ڵ� ����� �� �ְ� Reader�� �о��ֱ�
//						��2.���� �ϳ��� ����ϸ� �ʹ� ���� �ϰԵ�
		
		//read / writer �ϴ� while��
		String source = null;
		while( (source = br.readLine()) != null) {
//			bw.write(source + "\n");
			bw.write(source);
			bw.newLine();	//�޼ҵ� ���
			readCount++;
		}
		bw.flush(); //���� �� ��
		
		//Stream close()
		bw.close();
		br.close();
		
		System.out.println("\n\n===========================================");
		System.out.println("==============>> read Ƚ�� : readCount : "+readCount);
		System.out.println("==========================================");
		
	}

}