package p02;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			
			System.out.println("1"+"x"+i+"="+i*1);
		
	}
		for(int i=1;i<=9;i++) {
			
				System.out.println(i+"x"+"1 ="+i*1);
			
		}
		
		for(int i=9;i>=1;i--) {
			
			System.out.println(i+"x"+"1"+"="+i*1);
		
	}
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}

	}

}
