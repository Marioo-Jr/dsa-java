import util.Assert;

/* LeetCode 72 — Edit Distance [Medium] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (inserir/remover/substituir sobre duas strings)
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
public class EditDistance {

    public static void main(String[] args) {
        Assert.equals(3, minDistance("horse", "ros"), "horse -> rorse -> rose -> ros (3 operacoes)");
        Assert.equals(5, minDistance("intention", "execution"), "5 operacoes (exemplo classico)");
        Assert.equals(3, minDistance("", "abc"), "so inserir os 3 caracteres");
        Assert.equals(0, minDistance("abc", "abc"), "strings iguais -> 0 operacoes");
        Assert.resumo();
    }

    static int minDistance(String word1, String word2) {
        throw new UnsupportedOperationException("TODO");
    }
}
