package Manha.Exercicio.Exercicio6;

public class RunStringUtil {

    public static void main(String[] args){

        String rpad = "oi";
        System.out.println("Antes: " + rpad);
        System.out.println("Depois: " + StringUtil.rpad(rpad, 'i', 2));

        String ltrim = "   oi   ";
        System.out.println("Antes: " + ltrim);
        System.out.println("Depois: " + StringUtil.ltrim(ltrim));

        System.out.println("Antes: " + ltrim);
        System.out.println("Depois: " + StringUtil.rtrim(ltrim) + "!");

        System.out.println("Antes: " + ltrim);
        System.out.println("Depois: " + StringUtil.trim(ltrim) + "!");

        System.out.println(StringUtil.indexOfN("Mari", 'r', 1));

    }

}
