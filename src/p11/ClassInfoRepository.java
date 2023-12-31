package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class ClassInfoRepository {
	public List<Map<String,String>> getClassInfoList(Map<String,String> param){
		List<Map<String,String>> classInfoList=new ArrayList<>();
		Connection con=DBCon.getCon();
		
		try {
			Statement stmt=con.createStatement();
			String sql="SELECT * FROM CLASS_INFO";
			
			ResultSet rs=stmt.executeQuery(sql);  
			while(rs.next()) {
				Map<String,String> classInfo=new HashMap<>();
				classInfo.put("ci_Num", rs.getString("CI_NUM"));
				classInfo.put("ci_Name", rs.getString("CI_NAME"));
				classInfo.put("ci_Desc", rs.getString("CI_DESC"));
				classInfoList.add(classInfo);
			}
			  
		}
			catch (SQLException e) {
			
			e.printStackTrace();
		}
		return classInfoList;
	}
	public int insertClassInfo(Map<String,String> classInfo) {
		Connection con  = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO CLASS_INFO(CI_NAME, CI_DESC)";
			sql += " values('" + classInfo.get("ciName") + "','" + classInfo.get("ciDESC") + "'";
			
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteClassInfo(Map<String,String> classInfo) {
		Connection con  = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM CLASS_INFO WHERE CI_NUM=" +classInfo.get("ciNum");
			
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}

