import util.Assert;
import util.TreeNode;

/* LeetCode 110 — Balanced Binary Tree [Easy] | Tópico: Trees
 * Padrão: DFS pós-ordem, retornando -1 como sinal de "já desbalanceou" para cortar cedo
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
public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode balanceada = TreeNode.deArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        Assert.isTrue(isBalanced(balanceada), "exemplo balanceado do LeetCode");

        TreeNode desbalanceada = TreeNode.deArray(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        Assert.isTrue(!isBalanced(desbalanceada), "exemplo desbalanceado do LeetCode");

        Assert.isTrue(isBalanced(null), "árvore vazia é balanceada");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.isTrue(isBalanced(soRaiz), "só a raiz é balanceada");

        Assert.resumo();
    }

    static boolean isBalanced(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
