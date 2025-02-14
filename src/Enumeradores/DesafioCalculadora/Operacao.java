package Enumeradores.DesafioCalculadora;

public enum Operacao {
    SOMAR("+") {
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 + num2;
        }
    },
    SUBTRAIR("-") {
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDIR("/") {
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 / num2;
        }
    };

    private String simbolo;

    Operacao(String simbolo){
        this.simbolo = simbolo;
    }

    public abstract double executarOperacao(double num1, double num2);

    public String toString(){
        return this.simbolo;
    }
}
