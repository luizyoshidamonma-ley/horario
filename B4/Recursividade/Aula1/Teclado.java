package Aula1;

public class Teclado {
    char[] Teclas;
    String text;

    public Teclado() {
        this.Teclas = Teclas;
    }

    public void limparTexto() {
        this.text ="";
    }

    public void adicionarCaractere(char caractere) throws Exception {
        if (!contemCaractere(caractere)){
            throw new Exception ("Caractere inválido!");
        }
        this.text.concat(String.valueOf(caractere));
    }

    public void removerUltimoCaractere(char caractere) throws Exception{
        if (this.text.isEmpty()){
            throw new Exception("Não há mais caracteres para serem deletados");
        }
        this.texto
    }

    private boolean contemCaractere(char caractere){
        for( int i=0; i<Teclas.length ; i++){
            if (caractere == Teclas[i]){
                return true;
            }
        }
        return false;
    }

}


