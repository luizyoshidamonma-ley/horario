public class Teclado {
    char[] teclas;
    String texto = "";

    public Teclado(char[] teclas) {
        this.teclas = teclas;
    }

    public void limparTexto() {
        this.texto = "";
    }

    public void adicionarCaractere(char caractere) throws Exception {
        if (!contemCaractere(caractere)) {
            throw new Exception("Caractere inválido");
        }
        this.texto = this.texto.concat(String.valueOf(caractere));

    }

    public void removerUltimoCaractere() throws Exception{
        if(this.texto.isEmpty()){
            throw new Exception("Não há caracteres para ser deletado");
        }

        this.texto = this.texto.substring(0, this.texto.length() - 1);
        
    }

    private boolean contemCaractere(char caractere) {
        for (int i = 0; i < this.teclas.length; i++) {
            if (caractere == this.teclas[i]) {
                return true;
            }
        }
        return false;
    }

    public void ler(){
        System.out.println(this.texto);
    }
    
    public int quantidadeCaracteres(){
        return texto.length();
    }
    
    public boolean estaVazio(){
        if (texto.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
  //  public void adicionarTexto(String novoTexto) throws Exception {
    //    for (int i=0 ; i< novoTexto.length() ; i++){
      //      texto.adicionarCaractere(novoTexto.charAt(i));
        //}
    //}
    
    public void adicionarTexto(String novoTexto) throws Exception {
    for (int i = 0; i < novoTexto.length(); i++) {
        // 1. Fixed the loop condition to use novoTexto.length()
        // 2. Fixed charAt to read from novoTexto
        texto.adicionarCaractere(novoTexto.charAt(i)); 
    }
}


}