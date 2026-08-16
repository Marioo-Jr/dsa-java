import util.Assert;

/* LeetCode 55 — Jump Game [Medium] | Tópico: Greedy
 * Padrão: alcance máximo (greedy da direita para a esquerda, ou "farthest" da esquerda pra direita)
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
public class JumpGame {

    public static void main(String[] args) {
        Assert.isTrue(canJump(new int[]{2, 3, 1, 1, 4}), "consegue chegar ao fim");
        Assert.isTrue(!canJump(new int[]{3, 2, 1, 0, 4}), "fica preso no índice 3 (valor 0)");
        Assert.isTrue(canJump(new int[]{0}), "já começa no último índice");
        Assert.isTrue(!canJump(new int[]{1, 0, 1, 0}), "fica preso no índice 1 (valor 0)");
        Assert.resumo();
    }

    static boolean canJump(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
