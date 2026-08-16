import util.Assert;
import util.TreeNode;

/* LeetCode 104 — Maximum Depth of Binary Tree [Easy] | Tópico: Trees
 * Padrão: DFS recursivo
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
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        Assert.equals(3, maxDepth(arvore), "árvore de exemplo do LeetCode");

        Assert.equals(0, maxDepth(null), "árvore vazia");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.equals(1, maxDepth(soRaiz), "só a raiz");

        Assert.resumo();
    }

    static int maxDepth(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
