package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean correct=false;
		Random random=new Random();
		int count=0;
		int rNum=random.nextInt(10)+1;
		while(!correct) {
			System.out.println("1부터 10까지의 숫자 입력하세요 : ");
			int inputNum=Integer.parseInt(scan.nextLine());
			correct=rNum==inputNum;
			
			count++;
			
		
			
			}
		 System.out.println(count+"번 만에 맞췄다");
		 
		} 
			
		


	

}
