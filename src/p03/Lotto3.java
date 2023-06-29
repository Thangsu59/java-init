package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {

	public static void main(String[] args) {
		
		Random random=new Random();
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=random.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1~45까지의 6개의 숫자를 입력하세요");
		String lottoStr=scan.nextLine();	
		String[] strs=lottoStr.split(",");
		int count=0;
		for(int i=0;i<strs.length;i++) {
			
			int num=Integer.parseInt(strs[i]);
			for(int j=0;j<lotto.length;j++) {
			
			if (lotto[i]==num ) {
				count++;
				break;
			} 
			}
			
		}
		System.out.println(count+"개 맞췄습니다.");
	}

}
/*int [] lotto=new int[6];
 * 
 */
