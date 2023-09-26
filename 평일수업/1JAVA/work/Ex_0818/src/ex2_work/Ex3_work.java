package ex2_work;

import java.util.Random;

public class Ex3_work {
	public static void main(String[] args) {
		//변수 money에 10~5000사이의 난수를 발생시켜 넣는다.
		//단, 3450,2100,60과 같이 1의 자리는 반드시 0이 되도록 한다.
		
		//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개 필요한지
		//판단하는 코드 작성하기(가능한 적은 수의 동전 사용하기_
		Random rand = new Random();
//		double a =(double)Math.random()*100;
//		System.out.println(a);
		int money = rand.nextInt((499)+1)*10;
		int tmp = money;
		int result = 0;
		System.out.printf("수중의 돈 : %d 원\n",money);
		
		int[] coin = {500,100,50,10};
		for(int denom : coin) {
		result += tmp/denom;
		tmp-=tmp/denom*denom;
		}
		System.out.println(result);
	}
}
