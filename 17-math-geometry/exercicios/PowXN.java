import util.Assert;

/* LeetCode 50 — Pow(x, n) [Medium] | Tópico: Math & Geometry
 * Padrão: exponenciação rápida (fast power) por divisão e conquista, O(log n)
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
public class PowXN {

    private static final double EPS = 1e-9;

    public static void main(String[] args) {
        Assert.isTrue(Math.abs(myPow(2.0, 10) - 1024.0) < EPS, "expoente positivo, potência de 2");
        Assert.isTrue(Math.abs(myPow(2.1, 3) - 9.261) < 1e-6, "expoente positivo, base fracionária");
        Assert.isTrue(Math.abs(myPow(2.0, -2) - 0.25) < EPS, "expoente negativo vira 1/x^n");
        Assert.isTrue(Math.abs(myPow(2.0, 0) - 1.0) < EPS, "expoente 0 é sempre 1");
        Assert.isTrue(Math.abs(myPow(0.00001, 2147483647) - 0.0) < EPS, "expoente Integer.MAX_VALUE não deve travar/estourar");
        Assert.resumo();
    }

    static double myPow(double x, int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
