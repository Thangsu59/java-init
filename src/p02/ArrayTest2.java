package p02;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] strs=new String[10];
		//0->2 1->4 2->6 ... 9->20
		for(int i=0; i<10;i++) {
			strs[i]=(i+1)*2+"";
			
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(i+",");
			System.out.println(i+1);
		}

	}

}
