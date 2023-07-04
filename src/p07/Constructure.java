package p07;

import java.util.Scanner;

public class Constructure {
	public Constructure(){
		System.out.println("불름");
	}
	public Constructure(int num) {
		System.out.println("int num 불름");
	}
	public static void main(String[] args) {
		Constructure c= new Constructure();
		Constructure c1=new Constructure(1);
		Scanner scan=new Scanner(System.in);
	}

}
