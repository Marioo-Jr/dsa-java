import util.Assert;

/* 13 — 1-D Dynamic Programming | Teoria: Memoization vs Tabulação
 * Lição de referência: NeetCode DSA for Beginners → "1-Dimension DP"
 *
 * IDEIA: as duas formas resolvem a mesma recorrência de Fibonacci
 * (fib(n) = fib(n-1) + fib(n-2), fib(0)=0, fib(1)=1), mas em direções opostas:
 *
 *   - MEMOIZATION (top-down): começa da pergunta original (fib(n)) e desce
 *     recursivamente até os casos base, guardando (cache) cada resultado já
 *     calculado num Map/array. Antes de recalcular fib(k), consulta o cache.
 *     É a recursão "normal", só que sem recomputar o que já foi resolvido.
 *
 *   - TABULAÇÃO (bottom-up): começa dos casos base (fib(0), fib(1)) e sobe
 *     iterativamente até fib(n), preenchendo um array (a "tabela") na ordem.
 *     Não usa recursão — é um loop simples que sempre olha para resultados
 *     já preenchidos antes dele na tabela.
 *
 * Ambas são O(n) tempo e O(n) espaço (a versão tabulada dá para otimizar
 * para O(1) espaço guardando só os 2 últimos valores, mas aqui mantemos a
 * tabela completa para deixar o padrão claro).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MemoVsTabulacao {

    // TODO: top-down. Use um array de cache (long[n+1], iniciado com -1) ou um
    // Map<Integer,Long>. Casos base: n == 0 -> 0, n == 1 -> 1. Antes de
    // recalcular fibMemo(n), verifique se já está no cache.
    static long fibMemo(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: bottom-up. Crie long[] dp de tamanho n+1 (ou trate n<2 à parte).
    // dp[0] = 0, dp[1] = 1, depois para i de 2 até n: dp[i] = dp[i-1] + dp[i-2].
    // Retorne dp[n].
    static long fibTabulacao(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.equals(0L, fibMemo(0), "memo: fib(0) = 0");
        Assert.equals(1L, fibMemo(1), "memo: fib(1) = 1");
        Assert.equals(1L, fibMemo(2), "memo: fib(2) = 1");
        Assert.equals(55L, fibMemo(10), "memo: fib(10) = 55");
        Assert.equals(6765L, fibMemo(20), "memo: fib(20) = 6765");

        Assert.equals(0L, fibTabulacao(0), "tabulacao: fib(0) = 0");
        Assert.equals(1L, fibTabulacao(1), "tabulacao: fib(1) = 1");
        Assert.equals(1L, fibTabulacao(2), "tabulacao: fib(2) = 1");
        Assert.equals(55L, fibTabulacao(10), "tabulacao: fib(10) = 55");
        Assert.equals(6765L, fibTabulacao(20), "tabulacao: fib(20) = 6765");

        Assert.equals(fibMemo(30), fibTabulacao(30), "memo e tabulacao concordam em fib(30)");

        Assert.resumo();
    }
}
