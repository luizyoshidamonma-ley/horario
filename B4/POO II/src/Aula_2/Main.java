package Aula_2;

public class Main {
    static void main() {
        Guerreiro warrior = new Guerreiro("Darius",16,200);

        Mago mage = new Mago("Aurora",18,200);
        mage.exibirStatus();
        mage.atacar(warrior);
        warrior.exibirStatus();
        warrior.atacar(mage);


        mage.exibirStatus();
        warrior.exibirStatus();
    }
}
