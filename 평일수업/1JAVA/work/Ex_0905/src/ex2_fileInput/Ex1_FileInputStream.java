package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\WEB15_SJW\\1JAVA/test.txt";
		File f = new File(path);
		if (f.exists()) {
			try {
				FileInputStream fis = new FileInputStream("D:\\WEB15_SJW\\1JAVA/test.txt");

				// read() : 목적지로 가서 데이터를 1바이트씩 읽어서 반환합니다.
				// 더 이상 읽을 단어가 없다면 문장의 끝(End of File)인 -1을 반환한다.
				int code = 0;
				while ((code = fis.read()) != -1) {
					System.out.print((char)code);
				}
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
