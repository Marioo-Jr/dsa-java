import util.Assert;

/* LeetCode 62 — Unique Paths [Medium] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (grade, so direita/baixo)
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
public class UniquePaths {

    public static void main(String[] args) {
        Assert.equals(28, uniquePaths(3, 7), "grade 3x7: 28 caminhos");
        Assert.equals(3, uniquePaths(3, 2), "grade 3x2: 3 caminhos");
        Assert.equals(1, uniquePaths(1, 1), "grade 1x1: ja comeca no destino");
        Assert.equals(1, uniquePaths(1, 5), "grade 1 linha: so 1 caminho possivel");
        Assert.resumo();
    }

    static int uniquePaths(int m, int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
