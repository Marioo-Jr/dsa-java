import util.Assert;

/* LeetCode 846 — Hand of Straights [Medium] | Tópico: Greedy
 * Padrão: HashMap de contagem + TreeMap/menor chave para formar grupos consecutivos greedy
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
public class HandOfStraights {

    public static void main(String[] args) {
        Assert.isTrue(isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3), "forma [1,2,3],[2,3,4],[6,7,8]");
        Assert.isTrue(!isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4), "5 cartas não divide em grupos de 4");
        Assert.isTrue(isNStraightHand(new int[]{1}, 1), "grupo de tamanho 1, carta única");
        Assert.isTrue(!isNStraightHand(new int[]{8, 10, 12}, 3), "não são consecutivas (falta 9 e 11)");
        Assert.resumo();
    }

    static boolean isNStraightHand(int[] hand, int groupSize) {
        throw new UnsupportedOperationException("TODO");
    }
}
