package p08;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		float[] fls=new float[3];
		fls[0]=1.1f;
		fls[1]=22.1f;
		fls[2]=0.1111f;
		
		char[] chars=new char[3];
		chars[0]='a';
		chars[1]='b';
		chars[2]='d';
		
		String[] strs=new String[3];
		strs[0]="우리";
		strs[1]="모두";
		strs[2]="화이팅";
		
		ArrayList<Float> flsStrs=new ArrayList<Float>();
		for(int i=0;i<fls.length;i++) {
			flsStrs.add(fls[i]);
			
		}
		ArrayList<Character> charStrs=new ArrayList<Character>();
		for(int i=0;i<chars.length;i++) {
			charStrs.add(chars[i]);
			
		}
		ArrayList<String> strss=new ArrayList<String>();
		for(int i=0;i<strs.length;i++) {
			strss.add(strs[i]);
			
		}
		
		
		for(int i=0;i<flsStrs.size();i++) {
			System.out.println(flsStrs.get(i));
		}
		for(int i=0;i<charStrs.size();i++) {
			System.out.println(charStrs.get(i));
		}
		for(int i=0;i<strss.size();i++) {
			System.out.println(strss.get(i));
		}
		
	}

}
