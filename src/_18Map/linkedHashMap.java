package _18Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
	public static void main(String[] args) {
		Map<String, String> sMap = new LinkedHashMap<>();
		sMap.put("U.P", "Lucknow");
		sMap.put("Delhi", "New Delhi");
		sMap.put("Punjab", "Amritsar");
		sMap.put("Maharastra", "Mumbai");
		sMap.put("Tamil Nadu", "Chennai");
		
		for(Map.Entry<String, String> m:sMap.entrySet())
		{
			System.out.println("The state is "+m.getKey()+" and there capital is "+m.getValue());
		}
	}
}
