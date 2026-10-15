package Aula_3.Exemplo_2;

public class Main {
    static void main() {
        FiguraGeometrica r1 = new Retangulo(5,3);
        FiguraGeometrica c1 = new Circulo(3);

        System.out.printf("Área do retângulo: %.2f %n",r1.area());
        System.out.printf("Perímetro do retângulo:%.2f %n",r1.perimetro());
        System.out.printf("Área do círculo:%.2f %n",c1.area());
        System.out.printf("Perímetro do círculo:%.2f %n",c1.perimetro());
    }
}
