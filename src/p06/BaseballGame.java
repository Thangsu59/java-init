package p06;

import java.util.Random;
import java.util.Scanner;

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
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.print("3개의 숫자를 입력하세요 : ");
		String baseballnum=scan.nextLine();
		String[] strs=baseballnum.split(",");
		int[] compNums=new int[strs.length];
		for(int i=0;i<strs.length;i++) {
			compNums[i]=Integer.parseInt(strs[i]);	
		}
		int strike=0;
		int ball=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<compNums.length;j++) {
				if(nums[i]==compNums[j]) {
					if(i==j) {
						strike ++;
					}else {
						ball++;
					}
					break;
				}
			}
		}
		
		System.out.println(strike+"strike, "+ball+"ball");

	}

}
