package io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*	1.byte 처리를 위한 Stream인 input/output Stream을 이용하여
 * 		Keyboard로 입력, monitor로 출력하는 예
 *  2.한글 처리(문자처리)를 위하여 Reader/Writer 계열로 바꾸어 입력, 출력
 * */


public class WriterTest {
	//main method
	public static void main(String[] args) {
		try {
			//inputStream :: 표준입력장치 추상화한 class
//			InputStream inputStream = System.in;
			//문자처리를 위한 Reader로 변경
//			Reader reader = new InputStreamReader(inputStream);
			Reader reader = new InputStreamReader(System.in);
			
			//OutputStram :: 표준출력장치 추상화한 class
//			OutputStream outputStream = System.out;
			//문자처리를 위한 Writer로 변경
//			Writer writer = new OutputStreamWriter(outputStream);
			Writer writer = new OutputStreamWriter(System.out);
			
			System.out.println("입력을 기다립니다..");
			
			while(true) {
				int i = reader.read();
				writer.write(i);
//				writer.flush();
				
				if( (char)i == 'x' ) {
					break;
				}
			}
			//==>while문 내부의 flush()와 밖의 flush()의 의미는?
			writer.flush();
			
			//Stream close();
			reader.close();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}











