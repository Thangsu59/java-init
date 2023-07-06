package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		Map<String,String>m=new HashMap<>();
		m.put("name", "이병헌");
		m.put("movie", "악마를 보았다");
		m.put("country", "한국");
		m.put("trans", "남자");
		
		Map<String,String>m1=new HashMap<>();
		m1.put("name", "톰크루즈");
		m1.put("movie", "미션임파서블");
		m1.put("country", "미국");
		m1.put("trans", "남자");
		
		Map<String,String>m2=new HashMap<>();
		m2.put("name", "한효주");
		m2.put("movie", "반창꼬");
		m2.put("country", "한국");
		m2.put("trans", "여자");
		
		Map<String,String>m3=new HashMap<>();
		m3.put("name", "앤 해서웨이");
		m3.put("movie", "인턴");
		m3.put("country", "미국");
		m3.put("trans", "여자");
		
		List<Map<String,String>> mapList=new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3); 
		
		
		for(int i=0;i<mapList.size();i++) {
			Map<String,String> map=mapList.get(i);
			Iterator<String> it=map.keySet().iterator(); 
			while(it.hasNext()) {
				String key=it.next();
				System.out.print(key+" : "+map.get(key)+", ");
			}
			System.out.println(); 
		}
		 
		
		

	}

}
