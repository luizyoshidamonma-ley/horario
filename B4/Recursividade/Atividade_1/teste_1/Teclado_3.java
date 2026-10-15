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
    
    // método 4, adicionar palavra inteira
    public void adicionarTexto(String novoTexto) throws Exception {
        for (int i=0 ; i< novoTexto.length();i++){
            char caractere = novoTexto.charAt(i);
            
            if (!contemCaractere(caractere)){
                throw new Exception ("O teclado não contém um desses caracteres");
            }
        }
        this.texto += novoTexto;
    }
    
    // 5. Contar ocorrências de um caractere
    public int contarCaractere(char caractere){
        int ocorrencias =0;
        for (int i=0; i< this.texto.length();i++){
            if (this.texto.charAt(i) == caractere){
                ocorrencias ++;
            }
        }return ocorrencias;
    }
    
    // 6. Adicionar um caractere várias vezes 
    public void adicionarRepetido(char caractere, int quantidade) throws Exception{
        for (int i=0; i< quantidade ; i++){
            this.adicionarCaractere(caractere);
        }
    }
    
    // 7. Buscar a posição de um caractere
    public int posicaoCaractere(char caractere){
        int posicao =-1;
        for (int i=0; i<this.texto.length();i++){
            if (this.texto.charAt(i) == caractere){
                posicao = i;
                break;
            }
        }
        return posicao;
    }
    
    // 8. Remover todas as ocorrências de um caractere
    public void removerCaractere(char caractere){
        String textoPlaceHolder="";
        for (int i=0; i< this.texto.length();i++){
            if (this.texto.charAt(i) != caractere){
                textoPlaceHolder += this.texto.charAt(i);
            }else{
                continue;
            }
            
        }
        this.texto = textoPlaceHolder;
    }
    
    // 9. Substituir caracteres
    
    
}


