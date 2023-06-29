package p04;

public class Cafe {
	public static String getCoffee(String order,int price) {
		int coffeePrice=5000;
		if(price<coffeePrice) {
			return (coffeePrice-price)+"원 더 주세요";
		}
		String str="";
		if(price>coffeePrice){
			str= (price-coffeePrice)+"원 거슬러드릴게요";
		}
		return "주문하신 "+coffeePrice+ "원 짜리 "+order+"가 준비되었습니다."+str;
		}
	



	public static void main(String[] args) {
		
		String coffee =getCoffee("아아",2000);
		System.out.println(coffee);
		String coffee1 =getCoffee("아아",5000);
		System.out.println(coffee1);
		
		String coffee2 =getCoffee("아아",7000);
		System.out.println(coffee2);

	}

}