package p01;

public class StringCondition {

	public static void main(String[] args) {
		String s1="123";
		if(s1=="123") {
			System.out.println("s1은 123");
		
		}else {
			System.out.println("s1은 123이 아님");
		}
		String s2=new String("123");
		if(s2=="123") {
			System.out.println("s2는 123");
			
		}else {
			System.out.println("s2는 123이 아님");
		}
		String s3="";
		System.out.println(s3.equals(" "));
		
		String s4="   123";
		System.out.println(s4);
		System.out.println(s4.trim().equals("123"));
		
	}

}
