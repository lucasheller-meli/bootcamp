package ex6;

public class Ex6 {
    public static void main(String[] args) {

        System.out.println("rpad");
        String rpad = "oi";
        System.out.println("Antes -> "+rpad+"\nDepois -> "+StringUtil.rpad(rpad,'i',3));

        System.out.println("lpad - remover espaco a esquerda");
        String leftRemove = "        o i  o  ";
        System.out.println("Antes ->"+leftRemove+"\nDepois ->"+StringUtil.leftRemove(leftRemove));

        System.out.println("lpad - remover espaco a esquerda");
        String rightRemove = "        o i  o   ";
        System.out.println("Antes ->"+rightRemove+"\nDepois ->"+StringUtil.rightRemove(rightRemove)+"teste");

        System.out.println("remover espaco a esquerda e direita");
        String removeAllSpaces = "   o i o   ";
        System.out.println("Antes ->"+removeAllSpaces+"\nDepois ->"+StringUtil.removeBlankSpaces(removeAllSpaces));


    }
}
