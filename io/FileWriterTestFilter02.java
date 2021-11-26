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

/* 	==> Keyboard로 입력받은 내용 test.txt로 보내는 Application 작성
 * */
public class FileWriterTestFilter02 {
	//main method
	public static void main(String[] args) throws IOException {
		
		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		//keyboard로 입력받기 위한 Sink Stream Reader 및
		//1개의 line을 읽기 편한 readLine() method를 제공하는 BufferedReader 생성
//		Reader r = new InputStreamReader(System.in);
//		br = new BufferedReader(r);
		//ㄴ 이거 두 개 한 줄로 쓴 게 아래꺼		
		br = new BufferedReader(new InputStreamReader(System.in));
//		br = new BufferedReader(new FileReader(new InputStreamReader((System.in));
		
		//File에 글을 쓰기 위한 FileWriter 및 BufferedWriter 생성
//		FileWriter fw = new FileWriter("./src/io/test.txt");
//		bw = new BufferedWriter(fw);
		//ㄴ 이거 두 개 한 줄로 쓴 게 아래꺼		
		bw = new BufferedWriter(new FileWriter("./src/io/test.txt"));
//		bw = new BufferedWriter(new FileWriter("./src/io/test.txt"), true);
		System.out.println("파일에 저장하실 글을 입력하세요.");
		
		while(true) {
			String str = br.readLine();
			if(str.equals("끝")) {
				break;
			}
			bw.write(str, 3, str.length()-3);	//==> API 확인
			bw.newLine();					//==> API 확인 (줄 바꾸기)
		}
		bw.flush(); //잊지 않기
		
		//Stream close()
		bw.close();
		br.close();
		
		
	}

}
