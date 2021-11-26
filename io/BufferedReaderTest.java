package io;

import java.io.BufferedReader;
import java.io.FileReader;

/*	1.read() Method보다 효율적인 method를 제공하는 class 사용
 * 	2.Sink Stream : Data를 직접 주고받는 단순 입출력 Stream
 * 	  Filter stream : Sink Stream을 통해 들어온 Data 조작하는 Stream
 * 	  차이 이해 
 * */
public class BufferedReaderTest {
	//main method
	public static void main(String[] args) throws Exception {
		//read 수 count 위한 변수
		int readCount = 0;
		
		//SinkStream ==> 말단에서 단순 입출력만 담당
//		FileReader fr = new FileReader(args[0]);
		//FilterStream ==> 추가적인 기능을 제공
//		BufferedReader br = new BufferedReader(fr);
		
		//==>위의 두 line과 아래를 비교하자. (복사 붙어넣기 한 거임)
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String oneLine = null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine();	//API 확인
			if(oneLine == null) {
				break;
			}
			System.out.println("한줄출력 : " + readCount + " " + oneLine);
			
		}
		
		//Stream close
		br.close();
//		fr.close(); //filtering했기 때문에 필요 없어짐 
	}

}
