package Calculadora;

/**
 * <h1>TesteCalculadora</h1>
 * <p>
 * Esta classe é responsável por realizar testes simples e diretos
 * para validar o funcionamento da classe Calculadora.
 * Ela chama operações básicas como soma, subtração, multiplicação
 * e divisão, incluindo também testes de erro utilizando blocos try/catch.
 * </p>
 *
 * <p>
 * O objetivo desta classe é demonstrar:
 * </p>
 * <ul>
 *     <li>Execução das operações matemáticas implementadas</li>
 *     <li>Comportamento da calculadora com entradas válidas</li>
 *     <li>Tratamento de exceções para divisão por zero</li>
 *     <li>Tratamento de operadores inválidos</li>
 * </ul>
 *
 * @author Gustavo
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal que executa a aplicação.
     * Aqui são realizadas chamadas diretas ao método calcular()
     * com diferentes valores para validar o funcionamento geral da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizado)
     */
    public static void main(String[] args) {

        // Instancia o objeto Calculadora para realizar os testes
        Calculadora calc = new Calculadora();

        // Testes com operações válidas
        System.out.println(calc.calcular(2, 3, "+"));   // soma: resultado esperado = 5
        System.out.println(calc.calcular(10, 4, "-"));  // subtração: resultado esperado = 6
        System.out.println(calc.calcular(3, 5, "*"));   // multiplicação: resultado esperado = 15
        System.out.println(calc.calcular(8, 2, "/"));   // divisão: resultado esperado = 4

        // Teste com divisão por zero — deve lançar exceção
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Exibe mensagem da exceção
        }

        // Teste com operador inválido — deve lançar exceção
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Exibe mensagem da exceção
        }
    }
}
