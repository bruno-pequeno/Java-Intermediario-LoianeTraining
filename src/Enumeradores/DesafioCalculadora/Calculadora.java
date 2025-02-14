package Enumeradores.DesafioCalculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua conta (ex: 3 * 4): ");
        String conta = sc.nextLine();

        String[] array = conta.split(" ");

        if (array.length != 3) {
            System.out.println("Formato inválido! Use: número operador número");
            return;
        }

        try {
            double num1 = Double.parseDouble(array[0]);
            double num2 = Double.parseDouble(array[2]);
            String operador = array[1];

            Operacao operacao = null;
            for (Operacao op : Operacao.values()) {
                if (op.toString().equals(operador)) {
                    operacao = op;
                    break;
                }
            }

            if (operacao != null) {
                double resultado = operacao.executarOperacao(num1, num2);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operador inválido! Use +, -, * ou /");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Certifique-se de digitar números válidos.");
        }
    }
}
