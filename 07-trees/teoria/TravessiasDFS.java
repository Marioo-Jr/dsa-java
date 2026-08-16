import util.Assert;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/* 07 — Trees | Teoria: DFS (Preorder, Inorder, Postorder)
 * Lição de referência: NeetCode DSA for Beginners → "Depth-First Search"
 *
 * IDEIA: as três travessias DFS diferem só na ORDEM em que visitam o nó
 * atual em relação às subárvores: preorder visita o nó antes dos filhos,
 * inorder visita entre os filhos (numa BST, dá os valores em ordem
 * crescente), postorder visita depois dos filhos (útil quando é preciso
 * processar os filhos antes do pai, como em cálculo de altura).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class TravessiasDFS {

    // TODO: nó, esquerda, direita
    static List<Integer> preorder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: esquerda, nó, direita
    static List<Integer> inorder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: esquerda, direita, nó
    static List<Integer> postorder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{1, null, 2, 3});
        // árvore:  1
        //           \
        //            2
        //           /
        //          3

        Assert.equals(List.of(1, 2, 3), preorder(arvore), "preorder");
        Assert.equals(List.of(1, 3, 2), inorder(arvore), "inorder");
        Assert.equals(List.of(3, 2, 1), postorder(arvore), "postorder");

        Assert.equals(new ArrayList<Integer>(), preorder(null), "árvore vazia (preorder)");
        Assert.equals(new ArrayList<Integer>(), inorder(null), "árvore vazia (inorder)");
        Assert.equals(new ArrayList<Integer>(), postorder(null), "árvore vazia (postorder)");

        Assert.resumo();
    }
}
