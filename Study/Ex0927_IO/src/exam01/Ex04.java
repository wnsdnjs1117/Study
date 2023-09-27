package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        OutputStream out = null;
        try {
            out = new FileOutputStream("write_array.txt", false);
            String str = "hello world";
            // 문장을 바이트 배열로 변환하여 반환
            byte[] strArray = str.getBytes();
            System.out.println(Arrays.toString(strArray));
            out.write(strArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //객체가 사용 중이라면 닫는다.
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
