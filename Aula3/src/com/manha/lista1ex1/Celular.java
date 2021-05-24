package src.com.manha.lista1ex1;

public class Celular implements Precedente<Celular>{
    private double number;
    private String holder;
    public Celular(double number, String holder){
        this.number =number;
        this.holder = holder;
    }
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    @Override
    public int precedeA(Celular celular) {
        return celular.holder.compareTo(holder) > 0 ? 1:0;
    }
    @Override
    public String imprimeAtributo() {
        return holder;
    }
}