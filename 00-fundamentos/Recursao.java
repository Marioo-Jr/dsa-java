import util.Assert;

/* Fase 0 — Fundamentos | Recursão
 *
 * IDEIA: toda função recursiva precisa de (1) um caso base que para a
 * recursão e (2) um caso recursivo que se aproxima do caso base a cada
 * chamada. Se você não consegue identificar os dois antes de codar, pare e
 * pense de novo — é o erro mais comum.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas (caso base + caso recursivo):
 *   1.
 *   2.
 *   3.
 */
public class Recursao {

    public static void main(String[] args) {
        Assert.equals(120L, factorial(5), "factorial(5)");
        Assert.equals(1L, factorial(0), "factorial(0) = 1 por definição");

        Assert.equals(55L, fibonacci(10), "fibonacci(10)");
        Assert.equals(0L, fibonacci(0), "fibonacci(0)");
        Assert.equals(1L, fibonacci(1), "fibonacci(1)");

        Assert.equals(8L, potencia(2, 3), "2^3");
        Assert.equals(1L, potencia(7, 0), "7^0 = 1");

        Assert.isTrue(somaDigitos(1234) == 10, "somaDigitos(1234) = 1+2+3+4");

        Assert.resumo();
    }

    // TODO: caso base n <= 1 retorna 1; caso recursivo n * factorial(n-1).
    static long factorial(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: caso base n=0 -> 0, n=1 -> 1; caso recursivo fib(n-1) + fib(n-2).
    // (Não se preocupe com performance aqui — a versão eficiente com
    // memoization vem na Fase 13, 1-D DP.)
    static long fibonacci(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: base^expoente, recursivo. Caso base expoente == 0 -> 1.
    static long potencia(int base, int expoente) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: soma dos dígitos de um número positivo, recursivo.
    // Dica: caso base n < 10 -> retorna n; senão (n % 10) + somaDigitos(n / 10).
    static int somaDigitos(int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
