import util.Assert;

/* LeetCode 33 — Search In Rotated Sorted Array [Medium] | Tópico: Binary Search
 * Padrão: busca binária identificando qual metade está ordenada a cada passo
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
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        Assert.equals(4, search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0), "alvo do lado rotacionado");
        Assert.equals(-1, search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3), "alvo inexistente");
        Assert.equals(-1, search(new int[]{1}, 0), "elemento único, não encontrado");
        Assert.equals(0, search(new int[]{1}, 1), "elemento único, encontrado");
        Assert.equals(0, search(new int[]{5, 1, 3}, 5), "alvo é o pivô/início");
        Assert.resumo();
    }

    // nums é um array ordenado crescente, rotacionado em algum pivô
    // desconhecido, SEM duplicados. Retorna o índice de target, ou -1.
    static int search(int[] nums, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
