package fr.lidodo.plane;

public class CharLenghtUtil {

    public static int compute(String name) {
        int result = 0;
        char[] chars = name.toCharArray();
        for (char c : chars) {
            result += c;
        }
        return result;
    }

}
