package Aula_1;

public class Main {
    static void main() {
        Carro car = new Carro();
        Bicicleta bike = new Bicicleta();
        car.mover();
        System.out.println(car.tipo());
        bike.mover();
        System.out.println(bike.tipo());

    }
}
