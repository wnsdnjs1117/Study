package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ex01 {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,1,3,4));
        Collections.sort(list);
            for(int a :list){
                System.out.println(a);
        }
    }
}
