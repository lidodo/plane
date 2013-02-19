package fr.lidodo.plane;

public class CharLenghtUtil {

	public static int compute(String name){
		int result = 0;
		char[] chars = name.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			result += chars[i];
		}
		return result;
	}

}
