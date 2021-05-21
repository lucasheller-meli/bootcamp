public abstract class GeometricFigure {

    public abstract double area();

}

class Triangulo extends GeometricFigure{
    float base;
    float altura;

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        float area = base * altura / 2;
        return area;
    }
}

class Main{
    public static void main(String[] args){

        Triangulo triangulo = new Triangulo(3,4);

        System.out.println(triangulo.area());

    }
}