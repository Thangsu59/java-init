package p06;

public class HumanExec {

	public static void main(String[] args) {
		/*
		 * 5명의 사람
		 * 각각의 이름과 나이를 다르게 입력
		 * 길이 5개짜리 human 배열
		 * 반복문 사용 최고령 최연소가 누구인지 출력
		 */
		
		Human h1=new Human();
		h1.name="동동이";
		h1.age=33;
		
		Human h2=new Human();
		h2.name="퉁퉁이";
		h2.age=20;
		
		Human h3=new Human();
		h3.name="징징이";
		h3.age=50;
		
		Human h4=new Human();
		h4.name="동동";
		h4.age=35;
		
		Human h5=new Human();
		h5.name="빵빵이";
		h5.age=52;
		
		Human[] human=new Human[5];
		human[0]=h1;
		human[1]=h2;
		human[2]=h3;
		human[3]=h4;
		human[4]=h5;
		int ageMax=0;
		int ageMin=human[0].age;
		int sum=0;
		int average;
		int similar=0;
		String hStr="";
		String lStr="";
		for(int i=0;i<human.length;i++) {
			if(human[i].age>ageMax) {
				ageMax=human[i].age;
				hStr=human[i].name;
				
			}
		}
		for(int i=0;i<human.length;i++) {
			
			if(human[i].age<=ageMin) {
				ageMin=human[i].age;
				lStr=human[i].name;
			}
		}
		
		for(int i=0;i<human.length;i++) {
			sum+=human[i].age;
			
		}
		average=sum/human.length;
		
		System.out.println("최고령은 "+ ageMax+"의 "+hStr);
		System.out.println("최연소는 "+ ageMin+"의 "+lStr);
		
	}
	
	

}
