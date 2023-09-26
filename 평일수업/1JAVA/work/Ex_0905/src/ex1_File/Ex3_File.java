package ex1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "D:\\WEB15_SJW\\1JAVA/aaa/bbb";
		File f = new File(path);
		
		//f.exists() : 파일 클래스가 path경로로 찾아가는 중 정상적으로 폴더나 파일이 존재한다면 true를 반환
		if(!f.exists()) {
			//폴더 만들기
			System.out.println();
			f.mkdirs();
		}
	}
}
