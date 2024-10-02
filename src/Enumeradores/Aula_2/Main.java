package Enumeradores.Aula_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("Usando um enum como classe, com construtor e métodos");
        System.out.println("=====================================================");

        int valor = DiaSemana.DOMINGO.getValor();
        System.out.println(DiaSemana.DOMINGO + " nº" + valor);

    }
}
