import javax.swing.*;
import java.util.Arrays;

import static jdk.internal.org.jline.utils.Colors.h;
import static jdk.internal.org.jline.utils.Colors.s;

public class Ex04 {
    public static void main(String[] args) {
        //배열 spell 외계어 사전 dic 매개변수
        // 2이상 spell 10이하 , 1이상 dic 10이하


        int[] result1 = new int[10];
        int[] spell = result1;  //매개변수 spell 선언

        result1 = new int{a, b, c, d, e, f, g, h, i, k, j, l, n, m, o, p, q, r, s, t, u, v, w, x, y, z};  //spell 선언

        int[] result2 = new int[10];
        int[] dic = result2;  //매개변수 dic 선언

        result2 = new int{a, b, c, d, e, f, g, h, i, j, k, l, n, m, o, p, q, r, s, t, u, v, w, x, y, z}; // dic 선언


        if (result1 != result2) {

            //값이 똑같지 않으면  2
        }

            System.out.println();
        if () {
            //중복은 안됨
            //값이 하나라도 있으면 1
        }

        //S와 매칭이 똑같면 1
        //S와 매칭잎 존재하지 않으면 2


        //Araay.List 가능? , 결과값 1 또는 2 ,
        // 소문자만 있으면 됨
        //한번씩만 모두 사용한 단어가 dic에 존재 1 존재하지 않는다면 2 true/


    }
}
