package ex1_try_catch;

import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("입력 값: ");
		int input1 = stdIn.nextInt();
		
		System.out.println("입력 값: ");
		String input2 = stdIn.nextLine();

		System.out.println("출력 값: ");
		System.out.println(input1);
		
		System.out.println("출력 값: ");
		System.out.println(input2);
	}

}