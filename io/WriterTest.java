package io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*	1.byte ó���� ���� Stream�� input/output Stream�� �̿��Ͽ�
 * 		Keyboard�� �Է�, monitor�� ����ϴ� ��
 *  2.�ѱ� ó��(����ó��)�� ���Ͽ� Reader/Writer �迭�� �ٲپ� �Է�, ���
 * */


public class WriterTest {
	//main method
	public static void main(String[] args) {
		try {
			//inputStream :: ǥ���Է���ġ �߻�ȭ�� class
//			InputStream inputStream = System.in;
			//����ó���� ���� Reader�� ����
//			Reader reader = new InputStreamReader(inputStream);
			Reader reader = new InputStreamReader(System.in);
			
			//OutputStram :: ǥ�������ġ �߻�ȭ�� class
//			OutputStream outputStream = System.out;
			//����ó���� ���� Writer�� ����
//			Writer writer = new OutputStreamWriter(outputStream);
			Writer writer = new OutputStreamWriter(System.out);
			
			System.out.println("�Է��� ��ٸ��ϴ�..");
			
			while(true) {
				int i = reader.read();
				writer.write(i);
//				writer.flush();
				
				if( (char)i == 'x' ) {
					break;
				}
			}
			//==>while�� ������ flush()�� ���� flush()�� �ǹ̴�?
			writer.flush();
			
			//Stream close();
			reader.close();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}











