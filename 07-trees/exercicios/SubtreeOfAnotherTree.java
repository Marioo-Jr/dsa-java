import util.Assert;
import util.TreeNode;

/* LeetCode 572 — Subtree of Another Tree [Easy] | Tópico: Trees
 * Padrão: DFS — para cada nó de root, testa se a subárvore ali é igual (Same Tree) a subRoot
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
public class SubtreeOfAnotherTree {

    public static void main(String[] args) {
        TreeNode root1 = TreeNode.deArray(new Integer[]{3, 4, 5, 1, 2});
        TreeNode sub1 = TreeNode.deArray(new Integer[]{4, 1, 2});
        Assert.isTrue(isSubtree(root1, sub1), "exemplo positivo do LeetCode");

        TreeNode root2 = TreeNode.deArray(new Integer[]{3, 4, 5, 1, 2, null, null, null, null, 0});
        TreeNode sub2 = TreeNode.deArray(new Integer[]{4, 1, 2});
        Assert.isTrue(!isSubtree(root2, sub2), "exemplo negativo do LeetCode (nó extra quebra a igualdade)");

        TreeNode root3 = TreeNode.deArray(new Integer[]{1, 1});
        TreeNode sub3 = TreeNode.deArray(new Integer[]{1});
        Assert.isTrue(isSubtree(root3, sub3), "árvore inteira também conta como subárvore de si mesma");

        Assert.isTrue(!isSubtree(null, TreeNode.deArray(new Integer[]{1})), "root vazio nunca contém subRoot não-vazio");
        Assert.isTrue(isSubtree(TreeNode.deArray(new Integer[]{1}), null), "subRoot vazio é sempre subárvore (vazia)");

        Assert.resumo();
    }

    static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        throw new UnsupportedOperationException("TODO");
    }
}
