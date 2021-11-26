package io;

import java.io.BufferedReader;
import java.io.FileReader;

/*	1.read() Method���� ȿ������ method�� �����ϴ� class ���
 * 	2.Sink Stream : Data�� ���� �ְ�޴� �ܼ� ����� Stream
 * 	  Filter stream : Sink Stream�� ���� ���� Data �����ϴ� Stream
 * 	  ���� ���� 
 * */
public class BufferedReaderTest {
	//main method
	public static void main(String[] args) throws Exception {
		//read �� count ���� ����
		int readCount = 0;
		
		//SinkStream ==> ���ܿ��� �ܼ� ����¸� ���
//		FileReader fr = new FileReader(args[0]);
		//FilterStream ==> �߰����� ����� ����
//		BufferedReader br = new BufferedReader(fr);
		
		//==>���� �� line�� �Ʒ��� ������. (���� �پ�ֱ� �� ����)
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String oneLine = null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine();	//API Ȯ��
			if(oneLine == null) {
				break;
			}
			System.out.println("������� : " + readCount + " " + oneLine);
			
		}
		
		//Stream close
		br.close();
//		fr.close(); //filtering�߱� ������ �ʿ� ������ 
	}

}
