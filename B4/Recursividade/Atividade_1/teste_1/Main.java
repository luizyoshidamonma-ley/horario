/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) throws Exception {
       Teclado teclado1 = new Teclado(new char[]{'a','b'});
       teclado1.adicionarCaractere('a');
       teclado1.adicionarCaractere('b');
       teclado1.adicionarCaractere('a');
       teclado1.ler();
       teclado1.removerUltimoCaractere();
       teclado1.ler();
       System.out.print(teclado1.estaVazio()+"\n");
       teclado1.adicionarTexto("baba");
       teclado1.ler();
       System.out.print(teclado1.contarCaractere('a')+"\n");
       teclado1.adicionarRepetido('b',3);
       teclado1.ler();
       System.out.print(teclado1.posicaoCaractere('b')+"\n");
       teclado1.removerCaractere('a');
       teclado1.ler();
    }
   
}