package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> numList=new ArrayList<>();
		
		Random random=new Random();
		for(int i=0;i<6;i++) {
			int rNum=random.nextInt(100)+1;
			if(numList.indexOf(rNum)==-1) {
				numList.add(rNum);
			}
			else {
				i--;
			}
		}
		while(numList.size()<7) {
			int rNum=random.nextInt(100)+1;
			if(numList.indexOf(rNum)==-1) {
				numList.add(rNum);
		}
			System.out.println(numList);
		
		int max=numList.get(0);
		int min=numList.get(0);
		for(int i=1;i<numList.size();i++) {
			if(numList.get(i)>max) {
				max=numList.get(i);
			}
		}
		for(int i=1;i<numList.size();i++) {
			if(numList.get(i)<min) {
				min=numList.get(i);
			}
		}
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);

	}

}
}
