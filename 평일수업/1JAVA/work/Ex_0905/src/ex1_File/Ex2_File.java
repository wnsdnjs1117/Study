package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\WEB15_SJW\\1JAVA";
		File f = new File(path);
		
		//f.isDirectory : 최종 목적지가 폴더면 true, 아니면 false
		if (f.isDirectory()) {
			String[] names = f.list();
			for(String i : names) {
				System.out.println(i);
			}
		}
	}
}
