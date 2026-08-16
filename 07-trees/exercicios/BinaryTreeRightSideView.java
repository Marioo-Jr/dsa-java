import util.Assert;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/* LeetCode 199 — Binary Tree Right Side View [Medium] | Tópico: Trees
 * Padrão: BFS por nível, guardando o último nó de cada nível (ou DFS priorizando a direita)
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
public class BinaryTreeRightSideView {

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{1, 2, 3, null, 5, null, 4});
        Assert.equals(List.of(1, 3, 4), rightSideView(arvore), "exemplo do LeetCode");

        TreeNode soEsquerda = TreeNode.deArray(new Integer[]{1, 2, 3, 4});
        Assert.equals(List.of(1, 3, 4), rightSideView(soEsquerda), "último nível só tem nó à esquerda, mas ainda é visível");

        Assert.equals(new ArrayList<Integer>(), rightSideView(null), "árvore vazia");

        Assert.resumo();
    }

    static List<Integer> rightSideView(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
