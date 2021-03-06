package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*	==>FileCopy하는 Application 작성
 * 	1. Keyboard로 FileName을 입력
 * 	2. File로 내용을 read() ==> FileReader
 *  3. File로 내용을 write() ==> FileWriter
 * */
public class FileWriterTestFilter01 {
	//main method
	public static void main(String[] args) throws IOException {
		
		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";
		
		int readCount = 0; //read를 count하기 위한 변수
		
		System.out.print("copy할 file이름을 입력하세요 : ");
		//copy할 FileName을 입력받기...
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
//														    ㄴ1.키보드로 입력받아오기
//											ㄴ2.영어만 읽고 문자 못 읽으니까 Reader로 바꿔주기
//						ㄴ3.글자 하나씩 읽으면 스캔 너무 많이 하니까 line으로 읽어주기
		
		//==>원본파일 Data를 read할 수 있는 BufferedReader 생성
		br = new BufferedReader( new FileReader( fileName ));

		
		//==>사본파일 이름 만들기
		copyFileName = fileName + "_copy2";
		//==>Data를 write할 수 있는 BufferefWriter 생성
		bw = new BufferedWriter( new FileWriter(copyFileName) );
//										ㄴ1.문자도 출력할 수 있게 Reader로 읽어주기
//						ㄴ2.글자 하나씩 출력하면 너무 많이 하게됨
		
		//read / writer 하는 while문
		String source = null;
		while( (source = br.readLine()) != null) {
//			bw.write(source + "\n");
			bw.write(source);
			bw.newLine();	//메소드 사용
			readCount++;
		}
		bw.flush(); //잊지 말 것
		
		//Stream close()
		bw.close();
		br.close();
		
		System.out.println("\n\n===========================================");
		System.out.println("==============>> read 횟수 : readCount : "+readCount);
		System.out.println("==========================================");
		
	}

}
