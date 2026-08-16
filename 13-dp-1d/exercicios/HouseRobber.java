import util.Assert;

/* LeetCode 198 — House Robber [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (escolher/nao escolher, sem vizinhos adjacentes)
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
public class HouseRobber {

    public static void main(String[] args) {
        Assert.equals(4, rob(new int[]{1, 2, 3, 1}), "rouba casas 0 e 2: 1+3=4");
        Assert.equals(12, rob(new int[]{2, 7, 9, 3, 1}), "rouba casas 0,2,4: 2+9+1=12");
        Assert.equals(0, rob(new int[]{}), "array vazio");
        Assert.equals(5, rob(new int[]{5}), "uma casa so");
        Assert.equals(5, rob(new int[]{2, 5}), "duas casas, pega a maior");
        Assert.resumo();
    }

    static int rob(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
