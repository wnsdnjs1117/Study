package exam01;

import java.io.*;
import java.text.DecimalFormat;

public class Ex05 {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        DecimalFormat format = new DecimalFormat("#,###");
        try {
            in = new FileInputStream("back.jpg");
            out = new FileOutputStream("back_copy.jpg");
            long start = System.currentTimeMillis();
            System.out.println("이미지 읽기 시작");
            int read = 0;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println(format.format(time) + "ms");
            System.out.println("이미지 읽기 종료");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
