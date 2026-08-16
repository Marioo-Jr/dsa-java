import util.Assert;
import util.TreeNode;

/* LeetCode 105 — Construct Binary Tree From Preorder And Inorder Traversal [Medium] | Tópico: Trees
 * Padrão: o primeiro elemento do preorder é sempre a raiz; achar essa raiz no inorder
 * divide a árvore em subárvore esquerda e direita (recursão + HashMap de valor->índice no inorder)
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
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static void main(String[] args) {
        int[] preorder1 = {3, 9, 20, 15, 7};
        int[] inorder1 = {9, 3, 15, 20, 7};
        TreeNode esperado1 = TreeNode.deArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        Assert.equals(TreeNode.paraArray(esperado1), TreeNode.paraArray(buildTree(preorder1, inorder1)), "exemplo do LeetCode");

        int[] preorder2 = {-1};
        int[] inorder2 = {-1};
        TreeNode esperado2 = TreeNode.deArray(new Integer[]{-1});
        Assert.equals(TreeNode.paraArray(esperado2), TreeNode.paraArray(buildTree(preorder2, inorder2)), "só um nó");

        int[] preorder3 = {1, 2, 3};
        int[] inorder3 = {3, 2, 1};
        TreeNode esperado3 = TreeNode.deArray(new Integer[]{1, 2, null, 3});
        Assert.equals(TreeNode.paraArray(esperado3), TreeNode.paraArray(buildTree(preorder3, inorder3)), "árvore degenerada à esquerda");

        Assert.resumo();
    }

    static TreeNode buildTree(int[] preorder, int[] inorder) {
        throw new UnsupportedOperationException("TODO");
    }
}
