package Aula_3.Exemplo_2;
public class Circulo implements FiguraGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.pow(raio,2);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*raio;
    }
}
