package p05;

public class HumanExe {
	

	public static void main(String[] args) {
		Human[] human=new Human[5];
		
		human[0]=new Human();
		human[0].name="name1";
		human[0].money=20000;
		
		human[1]=new Human();
		human[1].name="심재훈";
		human[1].money=30000;
		
		human[2]=new Human();
		human[2].name="심재훈2";
		human[2].money=40000;
		
		human[3]=new Human();
		human[3].name="심재훈3";
		human[3].money=10000;
		
		human[4]=new Human();
		human[4].name="심재훈4";
		human[4].money=15000;
		
		int count=0;
		for(int i=0;i<human.length;i++) {
			int sum=human[i].money;
			count +=sum;
		}
		
		int average;
		average=count/human.length;
		
		for(int i=0;i<human.length;i++) {
			if (human[i].money>=average) {
				System.out.println("평균 이상인 사람은"+human[i].name);
			}
		}
		
		System.out.println("5명이 가진 총액 : " +count);
		System.out.println("5명의 평균액 : " +average);
		String names="";
		for(int i=0;i<human.length;i++) {
			if (human[i].money>=average) {
				
				names+=human[i].name+"님, ";
			}
			
		}
		names=names.substring(0,names.length()-2);
		
		System.out.println("평균 이상인 사람은 "+names+" 입니다.");
	}

}
