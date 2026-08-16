import util.Assert;

/* LeetCode 1046 — Last Stone Weight [Easy] | Tópico: Heap / Priority Queue
 * Padrão: max-heap
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n log n)  espaço O(n)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class LastStoneWeight {

    public static void main(String[] args) {
        Assert.equals(1, lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}), "exemplo clássico -> sobra 1");
        Assert.equals(0, lastStoneWeight(new int[]{2, 2}), "duas pedras iguais se anulam -> 0");
        Assert.equals(1, lastStoneWeight(new int[]{1}), "uma única pedra -> ela mesma");
        Assert.equals(0, lastStoneWeight(new int[]{}), "sem pedras -> 0");
        Assert.equals(2, lastStoneWeight(new int[]{1, 3}), "3-1=2 -> sobra 2");
        Assert.resumo();
    }

    static int lastStoneWeight(int[] stones) {
        throw new UnsupportedOperationException("TODO");
    }
}
