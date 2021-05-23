package Manha.Exercicio.Exercicio6;

public class StringUtil{
    //Clase unitarias
    public static String rpad(String s, char c, int n){
        return s + String.valueOf(c).repeat(Math.max(0,n));
    }

    public static String ltrim(String s){
        return s.replaceAll("^\\s+", "");
    }

    public static String rtrim(String s){
        return s.replaceAll("\s+$", "");
    }

    public static String trim(String s){
        return s.replaceAll("( +)", "").trim();
    }

    public static int indexOfN(String s, char c, int n){
        int count = 0, out = 0;

        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == c) { count++; }
            if (count == n) {
                out = i;
                break;
            }
        }
        return out;
    }
}
