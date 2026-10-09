package Aula_1;

public abstract class  Veiculo {
    public String tipo(){
        return getClass().getSimpleName();
    }

    abstract void mover();

}
