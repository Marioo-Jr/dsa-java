import util.Assert;

/* LeetCode 70 — Climbing Stairs [Easy] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (equivalente a Fibonacci)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        Assert.equals(1, climbStairs(1), "n=1: so 1 jeito");
        Assert.equals(2, climbStairs(2), "n=2: 1+1 ou 2");
        Assert.equals(3, climbStairs(3), "n=3: 1+1+1, 1+2, 2+1");
        Assert.equals(8, climbStairs(5), "n=5: fib-like -> 8 jeitos");
        Assert.equals(1, climbStairs(0), "n=0: 1 jeito (nao subir nenhum degrau)");
        Assert.resumo();
    }

    static int climbStairs(int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
