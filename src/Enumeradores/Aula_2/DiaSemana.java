package Enumeradores.Aula_2;

public enum DiaSemana {
    SEGUNDA(1), TERÇA(2), QUARTA(3), QUINTA(4),
    SEXTA(5), SÁBADO(6), DOMINGO(7);

    private final int valor;

    DiaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
