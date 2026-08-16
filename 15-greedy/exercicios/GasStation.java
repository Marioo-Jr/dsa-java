import util.Assert;

/* LeetCode 134 — Gas Station [Medium] | Tópico: Greedy
 * Padrão: se soma total de gas >= soma total de cost, existe exatamente 1 ponto de partida válido
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
public class GasStation {

    public static void main(String[] args) {
        Assert.equals(3, canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}), "começa no índice 3");
        Assert.equals(-1, canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}), "total de gas < total de cost: impossível");
        Assert.equals(4, canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}), "começa no índice 4");
        Assert.equals(0, canCompleteCircuit(new int[]{5}, new int[]{4}), "única estação, gas >= cost");
        Assert.resumo();
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
        throw new UnsupportedOperationException("TODO");
    }
}
