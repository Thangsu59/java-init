package p05;

public class FoodExec {

	public static void printFood(Food[] foods) {
		for(Food f: foods) {
		System.out.println("음식 : "+f.name);
		System.out.println("가격 : "+f.price);
		System.out.println("타입 : "+f.type);
		}
	
		
	}
	public static void main(String[] args) {
		Food f=new Food();
		Food f1=new Food();
		Food f2=new Food();
		Food f3=new Food();
		Food f4=new Food();
		f.name="삼겹살";
		f.price=15000;
		f.type="한식";
		
		f1.name="라멘";
		f1.price=9000;
		f1.type="일식";
		
		f2.name="마라탕";
		f2.price=14000;
		f2.type="중식";
		
		f3.name="스시";
		f3.price=15000;
		f3.type="일식";
		
		f4.name="햄버거";
		f4.price=10000;
		f4.type="미국식";
		System.out.println("음식 : "+f1.name);
		System.out.println("가격 : "+f1.price);
		System.out.println("타입 : "+f1.type);
		
		System.out.println("음식 : "+f2.name);
		System.out.println("가격 : "+f2.price);
		System.out.println("타입 : "+f2.type);
		
		System.out.println("음식 : "+f3.name);
		System.out.println("가격 : "+f3.price);
		System.out.println("타입 : "+f3.type);
		
		System.out.println("음식 : "+f4.name);
		System.out.println("가격 : "+f4.price);
		System.out.println("타입 : "+f4.type);
		
		
		Food[] foods=new Food[5]; 
		foods[0]=f;
		foods[1]=f1;
		foods[2]=f2;
		foods[3]=f3;
		foods[4]=f4;
		
		f.name="치킨";
		//System.out.println(foods[0].name);
		f=null;
		printFood(foods);
		//System.out.println(foods[0].name);

	}

}
