package p02;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r=new Random();
		int[] lotto=new int[6];
	
	for(int i=0;i<6;i++) {
		lotto[i]=r.nextInt(45)+1;
	}
	for(int i=0;i<6;i++) {
		System.out.println(lotto[i]);
	}
	
	}

}
