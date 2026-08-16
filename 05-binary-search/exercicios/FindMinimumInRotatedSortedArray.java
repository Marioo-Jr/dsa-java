import util.Assert;

/* LeetCode 153 — Find Minimum In Rotated Sorted Array [Medium] | Tópico: Binary Search
 * Padrão: busca binária comparando com os extremos da janela pra decidir qual metade está "quebrada"
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
public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        Assert.equals(1, findMin(new int[]{3, 4, 5, 1, 2}), "rotação simples");
        Assert.equals(0, findMin(new int[]{4, 5, 6, 7, 0, 1, 2}), "rotação no meio");
        Assert.equals(11, findMin(new int[]{11, 13, 15, 17}), "sem rotação (já ordenado)");
        Assert.equals(1, findMin(new int[]{1}), "elemento único");
        Assert.equals(1, findMin(new int[]{2, 1}), "dois elementos rotacionados");
        Assert.resumo();
    }

    // nums é um array ordenado crescente, rotacionado em algum pivô
    // desconhecido, SEM duplicados. Retorna o menor elemento.
    static int findMin(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
