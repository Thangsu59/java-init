package p03;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		Random random=new Random();
		int[] lotto=new int[7];
		for(int i=0;i<lotto.length;i++) {
			int rNum=random.nextInt(40)+1;
			for(int j=0;j<7;j++) {
				if(lotto[j]==rNum) {
					i--;
					break;
				}
			}
			if(lotto[i]==0) {
				lotto[i]=rNum;
			}
			
		}
		for(int i=0;i<7;i++) {
			System.out.println("lotto["+i+"] : "+lotto[i]);
		}

	}

}
