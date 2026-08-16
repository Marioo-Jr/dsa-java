import util.Assert;
import util.TreeNode;

/* LeetCode 230 — Kth Smallest Element In a BST [Medium] | Tópico: Trees
 * Padrão: inorder traversal (dá os valores em ordem crescente numa BST), parando no k-ésimo
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
public class KthSmallestElementInABST {

    public static void main(String[] args) {
        TreeNode arvore1 = TreeNode.deArray(new Integer[]{3, 1, 4, null, 2});
        Assert.equals(1, kthSmallest(arvore1, 1), "exemplo 1 do LeetCode (k=1)");

        TreeNode arvore2 = TreeNode.deArray(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
        Assert.equals(3, kthSmallest(arvore2, 3), "exemplo 2 do LeetCode (k=3)");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.equals(1, kthSmallest(soRaiz, 1), "só a raiz, k=1");

        Assert.equals(6, kthSmallest(arvore2, 6), "maior valor da árvore (k = tamanho da árvore)");

        Assert.resumo();
    }

    static int kthSmallest(TreeNode root, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
