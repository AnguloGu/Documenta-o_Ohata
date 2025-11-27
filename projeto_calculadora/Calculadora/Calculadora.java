/**
 * <h1>Calculadora</h1>
 * <p>Esta classe oferece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão. Além disso, valida o operador informado e impede
 * divisão por zero, lançando exceções quando necessário.</p>
 *
 * <p>Esta prática é utilizada para demonstrar:</p>
 * <ul>
 *     <li>Tratamento de erros (try/catch)</li>
 *     <li>Validação de entradas</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com JavaDoc</li>
 * </ul>
 *
 * <!-- Comentário HTML -->
 *
 * <p>Devido à refatoração, os métodos desta classe são <strong>totalmente puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Juan
 * @version 1.0
 */

public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai um número do outro.
     *
     * @param a minuendo
     * @param b subtraendo
     * @return o resultado da subtração
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a fator 1
     * @param b fator 2
     * @return o produto dos fatores
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide um número pelo outro, caso o divisor seja diferente de zero.
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado da divisão
     * @throws IllegalArgumentException se o divisor for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     *
     * <p><b>Operadores aceitos:</b></p>
     * <ul>
     *     <li>"+" → Soma</li>
     *     <li>"-" → Subtração</li>
     *     <li>"*" → Multiplicação</li>
     *     <li>"/" → Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resultará em exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o valor calculado conforme o operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
