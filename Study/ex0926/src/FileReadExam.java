import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExam {
    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("test.txt");

            int read = 0; // 원래 byte이어야 함 근데 반환형이 int형임
            byte[] buffer = new byte[50];
            //read(byte[] arr) 은 리턴으로 읽은 개수
            while ((read = in.read(buffer)) != -1) {
                //아스키코드표에 의해서 문자~~> 숫자포 표기하여 리턴
//                System.out.write(buffer, 0, read);
                System.out.print(new String(buffer,0,read));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
