import util.Assert;

/* LeetCode 45 — Jump Game II [Medium] | Tópico: Greedy
 * Padrão: BFS implícito por níveis (janela de alcance greedy)
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
public class JumpGameII {

    public static void main(String[] args) {
        Assert.equals(2, jump(new int[]{2, 3, 1, 1, 4}), "mínimo de 2 saltos");
        Assert.equals(2, jump(new int[]{2, 3, 0, 1, 4}), "mínimo de 2 saltos, desviando do 0");
        Assert.equals(0, jump(new int[]{1}), "já está no último índice, 0 saltos");
        Assert.equals(1, jump(new int[]{1, 2}), "1 salto direto");
        Assert.resumo();
    }

    static int jump(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
