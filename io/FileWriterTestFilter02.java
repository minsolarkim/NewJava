package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/* 	==> Keyboard�� �Է¹��� ���� test.txt�� ������ Application �ۼ�
 * */
public class FileWriterTestFilter02 {
	//main method
	public static void main(String[] args) throws IOException {
		
		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		//keyboard�� �Է¹ޱ� ���� Sink Stream Reader ��
		//1���� line�� �б� ���� readLine() method�� �����ϴ� BufferedReader ����
//		Reader r = new InputStreamReader(System.in);
//		br = new BufferedReader(r);
		//�� �̰� �� �� �� �ٷ� �� �� �Ʒ���		
		br = new BufferedReader(new InputStreamReader(System.in));
//		br = new BufferedReader(new FileReader(new InputStreamReader((System.in));
		
		//File�� ���� ���� ���� FileWriter �� BufferedWriter ����
//		FileWriter fw = new FileWriter("./src/io/test.txt");
//		bw = new BufferedWriter(fw);
		//�� �̰� �� �� �� �ٷ� �� �� �Ʒ���		
		bw = new BufferedWriter(new FileWriter("./src/io/test.txt"));
//		bw = new BufferedWriter(new FileWriter("./src/io/test.txt"), true);
		System.out.println("���Ͽ� �����Ͻ� ���� �Է��ϼ���.");
		
		while(true) {
			String str = br.readLine();
			if(str.equals("��")) {
				break;
			}
			bw.write(str, 3, str.length()-3);	//==> API Ȯ��
			bw.newLine();					//==> API Ȯ�� (�� �ٲٱ�)
		}
		bw.flush(); //���� �ʱ�
		
		//Stream close()
		bw.close();
		br.close();
		
		
	}

}
