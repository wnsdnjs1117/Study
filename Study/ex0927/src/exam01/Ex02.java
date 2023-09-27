package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex02 {
    public static void main(String[] args) {
        // 파일을 읽어올 뱐수
        int read = 0;
        // 스트림 선언
        InputStream in = null;
        // 데이터를 담을 배열 선언
        byte[] buffer = new byte[10];
        try {
            in = new FileInputStream("my_hangul.txt");
            while (true) {
                // 파일 읽기
                // 읽어온 데이터는 배열에 담긴다.
                read = in.read(buffer);
                System.out.print( in.available());
                System.out.println(" "+read);
                // -1 이면 종료
                if (read == -1) {
                    break;
                }
//                System.out.print(new String(buffer,0,read));
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
