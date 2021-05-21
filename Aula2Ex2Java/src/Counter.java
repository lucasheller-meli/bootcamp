public class Counter {
    private int num;

    public Counter(int num){
        this.num = num;
    }

    public Counter(Counter novo){
        this.num = novo.getNum();
    }

    public Counter(){

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int adicao(int numSoma){
        this.num = num + numSoma;
        return num;

    }

    public int subtracao(int numSub){
        this.num = num - numSub;
        return num;

    }

}
