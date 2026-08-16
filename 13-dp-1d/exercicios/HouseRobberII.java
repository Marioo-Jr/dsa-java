import util.Assert;

/* LeetCode 213 — House Robber II [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D aplicado 2x (casas em círculo: primeira e última são vizinhas)
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
public class HouseRobberII {

    public static void main(String[] args) {
        Assert.equals(3, rob(new int[]{2, 3, 2}), "circulo: nao pode pegar casa 0 e 2 juntas, melhor e so casa 1 (3)");
        Assert.equals(4, rob(new int[]{1, 2, 3, 1}), "circulo: rouba casas 0 e 2 (indices nao adjacentes no circulo): 1+3=4");
        Assert.equals(3, rob(new int[]{1, 2, 3}), "circulo de 3: melhor e so a casa do meio (3)");
        Assert.equals(5, rob(new int[]{5}), "uma casa so, sem vizinho circular");
        Assert.equals(2, rob(new int[]{1, 2}), "duas casas em circulo (vizinhas nos dois lados), pega a maior");
        Assert.resumo();
    }

    static int rob(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
