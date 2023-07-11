package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class ClassInfoController {
	public List<Map<String,String>> getClassInfoList(Map<String,String> param){
		ClassInfoService ciService=new ClassInfoService();
		return ciService.getClassInfoList(param);
		
	}
	public int insertClassInfo(Map<String,String> classInfo) {
		
		return 0;
	}
	
	public int deleteClassInfo(Map<String,String> classInfo) {
		return 0; 
	}  
	public static void main(String[] args) {
		ClassInfoController ciController=new ClassInfoController();
		Map<String,String> param=new HashMap<>();
		param.put("ciName", "퉁");
		List<Map<String,String>> classInfoList=ciController.getClassInfoList(param);
		System.out.println("번호\t이름\t설명");
		for(Map<String,String> classInfo : classInfoList) {
			System.out.println(classInfo.get("ciNum")+"\t"+classInfo.get("ciName")+"\t"
					+classInfo.get("ciDesc"));
			
		}
		param.put("ciName", "이철수");
		param.put("ciDesc", "배고픔");
		int result = ciController.insertClassInfo(param);
		System.out.println("실행 결과 : " + result);
		
		param.put("ciNum", "9");
		int result2=ciController.deleteClassInfo(param);
		System.out.println("실행 결과 : " + result);
	}
		
	}


