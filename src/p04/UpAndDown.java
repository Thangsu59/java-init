package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static void printUpDown() {
		Random r=new  Random();
		int rNum=r.nextInt(50)+1;
		
		Scanner scan=new Scanner(System.in);
	
		
		
		/*rNum과 numStr이 같은 값이면 맞췄다
		 * rNum이 numStr의 값보다 더크면 Up
		 * rNumdl numStrdml 값보다 작다면 DOWN
		 * 
		 */
		while(true){
			
			System.out.print("1~50 : ");
			String numStr=scan.nextLine();
			
			
			if(rNum>Integer.parseInt(numStr)) {
				System.out.println("Up");
			}
			if(rNum<Integer.parseInt(numStr)){
				System.out.println("Down");
			}
			if(rNum==Integer.parseInt(numStr)){
				System.out.println("맞췄다.");
			break;
			}
		
		}
	}
		
	
	public static void main(String[] args) {
		printUpDown();
}
	}


