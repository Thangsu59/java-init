package p08;

import java.util.ArrayList;

public class ListTest {
	
	public static void main(String[] args) {
		String str1="안녕,";
		String str2="내 소개를";
		String str3=" 하지.";
		String str4=" 내 직업은";
		String str5=" 노원구불주먹이야.";
		
		String[] str=new String[5];
		str[0]=str1;
		str[1]=str2;
		str[2]=str3;
		str[3]=str4;
		str[4]=str5;
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		
		ArrayList<String> strList=new ArrayList<String>();
		System.out.println(strList.size());
		strList.add("1");
		System.out.println(strList.size());
		strList.add("2");
		System.out.println(strList.size());
		strList.add("가");
		System.out.println(strList.size());
		strList.remove(0);
		System.out.println(strList.size());
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(1);
	}

}
