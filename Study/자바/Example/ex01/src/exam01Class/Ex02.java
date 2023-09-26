package exam01Class;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        MathCalc math = new MathCalc();
        Scanner scan = new Scanner(System.in);
        System.out.println("넓이를 구할 원의 반지름 :");
        int ban = scan.nextInt();
        double result = (ban*ban) * MathCalc.pi;
        math.print(result);

        scan.close();

    }
}
