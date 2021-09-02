package Util;

public class StringUtil {
	public static boolean isEmpty(String str) { //判断str是否为空，为空的话返回真，否则返回假
		if("".equals(str) || str == null) {    
			return true;
		}
		return false;			
	}
}
