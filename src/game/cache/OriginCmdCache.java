package game.cache;

import java.util.LinkedList;
import java.util.List;

public class OriginCmdCache {
	public static List<String> list = new LinkedList<>();
	
	public static void addOriginCmd(String originContent){
		list.add(originContent);
	}
	public static List<String> getOriginCmdList(){
		return list	;
	}
}
