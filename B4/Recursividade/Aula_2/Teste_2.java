package Aula_2;

public class Teste_2 {
    static void main() {
        System.out.println("Laço normal");
        for(int i=0; i<=5 ; i++){
            System.out.println(i);
        }

        System.out.println("Laço com recursividade");
        abc(5);


    }

    public static int abc(int x){
        int acumulador;
        if (x <=0){      // critério de parada
            return -1;
        }
        acumulador = x * abc(x - 1);
        System.out.println(acumulador);

        return x;
    }

}
