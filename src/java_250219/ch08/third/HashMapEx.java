package java_250219.ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("장원영키", 170);
		friends.put("전지현키", 171);
		friends.put("장동건키", 172);
		friends.put("고소영키", 173);
		friends.put("최은경키", 174);

//		friends.remove("최은경키"); ==> 삭제(remove)시에는 "키값"을 사용한다.
		
		for(String strKey: friends.keySet()) {
			Integer strValue = friends.get(strKey);
			System.out.println(strKey + ": strValue: " + strValue);
		}
		
		
	}

}
