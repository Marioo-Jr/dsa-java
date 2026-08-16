import util.Assert;

/* LeetCode 704 — Binary Search [Easy] | Tópico: Binary Search
 * Padrão: busca binária clássica
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
public class BinarySearch {

    public static void main(String[] args) {
        Assert.equals(4, search(new int[]{-1, 0, 3, 5, 9, 12}, 9), "encontra no meio-fim");
        Assert.equals(-1, search(new int[]{-1, 0, 3, 5, 9, 12}, 2), "não existe");
        Assert.equals(0, search(new int[]{5}, 5), "array de um elemento, encontrado");
        Assert.equals(-1, search(new int[]{5}, -5), "array de um elemento, não encontrado");
        Assert.resumo();
    }

    // nums está ordenado e SEM duplicados. Retorna o índice de target, ou -1.
    static int search(int[] nums, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
