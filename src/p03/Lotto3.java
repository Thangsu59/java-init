package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {

	public static void main(String[] args) {
		int count=0;
		Random random=new Random();
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=random.nextInt(6)+1;
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1~45까지의 6개의 숫자를 입력하세요");
		String lottoStr=scan.nextLine();	
		String[] strs=lottoStr.split(",");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
			
			if (strs[i]=lotto[i]) {
				count++;
			}
			
		}
		System.out.println(count+"개 맞췄습니다.");
	}

}
/*int [] lotto=new int[6];
 * 
 */
