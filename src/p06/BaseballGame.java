package p06;

import java.util.Random;

public class BaseballGame {

	public static void main(String[] args) {
		Random random=new Random();
		int[] nums=new int[3];
		for(int i=0;i<nums.length;i++) {
			int rNum=random.nextInt(10);
			for(int j=0;j<i;j++) {
				if(nums[j]==rNum) {
					i--;
					break;
				}
			}
			if(nums[i]==0) {
				nums[i]=rNum;
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
			if(i!=nums.length-1) {
				System.out.print(", ");
			}
		}
		
		

	}

}
