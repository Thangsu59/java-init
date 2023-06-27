package p02;

public class ArrayTest {

	public static void main(String[] args) {
		String[] strs;
		String[] strs2=new String[2];
		System.out.println(strs2[0]);
		System.out.println(strs2[1]);
		
		strs2[0]="1";
		strs2[1]="2";
	
		String[] strNums=new String[10];
		
		
		//0->1 1->2 2->3 9->10
		for(int i=0;i<10;i++) {
			
		System.out.print(i+",");
		System.out.println(i+1);
		strNums[i]=i+1+"";
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(strNums[i]);
		}

	}

}
