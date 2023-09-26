package ex1_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		String path = "D:\\WEB15_SJW\\1JAVA/test.txt";
		File f = new File(path);
		
		//f.isFile() : 최종 목적지가 파일이면 true, 아니면 false
		if(f.isFile()) {
			//f.length() : 최종 목적이 파일의 크기를 반환
			System.out.println(f.length()+"byte");
		}
	}
}
