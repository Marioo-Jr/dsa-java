import util.Assert;
import util.TreeNode;

import java.util.List;

/* LeetCode 226 — Invert Binary Tree [Easy] | Tópico: Trees
 * Padrão: DFS recursivo, trocando os filhos de cada nó
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
public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        Assert.equals(List.of(4, 7, 2, 9, 6, 3, 1), TreeNode.paraArray(invertTree(arvore)), "exemplo do LeetCode");

        TreeNode pequena = TreeNode.deArray(new Integer[]{2, 1, 3});
        Assert.equals(List.of(2, 3, 1), TreeNode.paraArray(invertTree(pequena)), "árvore pequena");

        Assert.equals(null, invertTree(null), "árvore vazia");

        Assert.resumo();
    }

    static TreeNode invertTree(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
