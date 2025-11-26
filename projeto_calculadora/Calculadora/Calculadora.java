package Calculadora;

public class Calculadora {

    public int r = 0;

    public int calc(int a, int b, String op) {

        //Calculadora
        if (op.equals((Object) "+")) {
            r = a + b;
        } else if (op.equals((Object) "-")) {
            r = a - b;
        } else if (op.equals((Object) "*")) {
            r = a * b;
        } else if (op.equals((Object) "/")) {
            if (b != 0) {
                r = a / b;
            } else {
                System.out.println("x: Erro: divisao por zero, operação irregular");
                r = 0;
            }
        } else {
            System.out.println("x: Operacao invalida");
            r = 0;
        }

        System.out.println("Resultado = " + r);
        return r;
    }
}
