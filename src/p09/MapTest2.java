package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String>m=new HashMap<>();
		m.put("team", "맨유");
		m.put("rank", "3");
		m.put("country", "잉글랜드");
		m.put("captain", "매과이어");
		
		Map<String,String>m2=new HashMap<>();
		m2.put("team", "레알마드리드");
		m2.put("rank", "2");
		m2.put("country", "스페인");
		m2.put("captain", "벤제마");
		
		Map<String,String>m3=new HashMap<>();
		m3.put("team", "뮌헨");
		m3.put("rank", "1");
		m3.put("country", "독일");
		m3.put("captain", "뮐러");
		
		Map<String,String>m4=new HashMap<>();
		m4.put("team", "파리");
		m4.put("rank", "1");
		m4.put("country", "프랑스");
		m4.put("captain", "마르퀴뇨스");
		
		List<Map<String,String>> mapList=new ArrayList<>();
		mapList.add(m);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		
		for(int i=0;i<mapList.size();i++) {
			Map<String,String> map=mapList.get(i);
			Iterator<String> it=map.keySet().iterator();
			while(it.hasNext()) {
				String key=it.next();
				System.out.print(key+" : "+map.get(key)+",");
			}
			System.out.println();  
		}
		
		
		
	}

}
