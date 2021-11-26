package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderTest {

	//main method
	public static void main(String[] args) 	{
		//InputStream :: ǥ���Է���ġ �߻�ȭ�� class
		InputStream inputStream = System.in;
		//InputStream�� Reader�� ���� (byteó�� ==> ����ó�� ����)
		Reader reader = new InputStreamReader(inputStream);
		System.out.println("�Է��� ��ٸ��ϴ�...");

		try	{
			//���� �о���̴� ���� loop ����
			while(true){
				//1. java.io�� ����(block)�� �� �ִ�.
				int i = reader.read();
				char c = (char) i;

				//2. java.io�� FIFO�� ����
				System.out.println("�Է��Ͻ� �� : " +c );
				
				//==> char 'x'�� �ԷµǸ� while ����
				if(c=='x'){
					reader.close();
					break;
				}
				//�ѱ��Է½� ����(?)��... �ѱ� 1EA�� 2�� ����� ���� Ȯ������.
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
