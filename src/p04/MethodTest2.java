package p04;

import java.util.Random;

public class MethodTest2 {

	public static int getRandomNum(int max) {
		Random r=new Random();
		int rNum= r.nextInt(max);
		rNum+=1;
		return rNum;
		
	}
	public static void main(String[] args) {

		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(20));
		System.out.println(getRandomNum(1));
		

	}

}
