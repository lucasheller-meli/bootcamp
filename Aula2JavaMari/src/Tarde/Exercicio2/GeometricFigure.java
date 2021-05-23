package Tarde.Exercicio2;

public abstract class GeometricFigure {

    public abstract double area();

}

class Triangulo extends GeometricFigure {
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

class Retangulo extends GeometricFigure{

    float base;
    float altura;

    public Retangulo(float base, float altura){
        this.base =base;
        this.altura=altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}


class Main{
    public static void main(String[] args){

        Triangulo triangulo = new Triangulo(2,4);
        Retangulo retangulo = new Retangulo(2, 4);

        GeometricFigure[] arr = new GeometricFigure[2];
        arr[0] = triangulo;
        arr[1] = retangulo;
        double ap = areaMedia(arr);

        System.out.println(triangulo.area());
        System.out.println(retangulo.area());
        System.out.println(ap);

    }

    public static double areaMedia(GeometricFigure arr[]){
        double sum = 0;
        for(GeometricFigure fg:arr){
            sum+=fg.area();
        }
        return sum/arr.length;
    }
}