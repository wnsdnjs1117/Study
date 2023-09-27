package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        // 파일을 읽어올 변수
        int read = 0;
        InputStream in = null;
        try{
            in = new FileInputStream("my_file.txt");
            while(true){
                //파일 읽기
                read = in.read();
                //-1이면 종료
                if(read == -1){
                    break;
                }
                System.out.print((char)read);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            //각체가 사용 중이라면 닫는다.
            if(in != null){
                in.close();
            }
        }
    }
}