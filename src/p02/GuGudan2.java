package p02;

import java.util.Scanner;

public class GuGudan2 {

	public static void main(String[] args) {
		//input : 4  1X4=4 2X4=8 9X4=36
		Scanner scan=new Scanner(System.in);
		System.out.println("input : ");
		String numstr=  scan.nextLine();
		int num=Integer.parseInt(numstr);
		
		for(int i=1;i<=9;i++) {
			
			System.out.println(i+"x"+numstr+"="+i*num);
	}

	}

}
