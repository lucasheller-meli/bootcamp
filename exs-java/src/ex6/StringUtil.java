package ex6;

public class StringUtil {


    public static String rpad(String s, char c, int n) {
        return s + String.valueOf(c).repeat(Math.max(0, n));
    }


    public static String leftRemove(String s) {
        return s.replaceAll("^\\s+", "");
    }


    public static String rightRemove(String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String removeBlankSpaces(String s) {
                return s.replaceAll("( +)"," ").trim();

    }



}
