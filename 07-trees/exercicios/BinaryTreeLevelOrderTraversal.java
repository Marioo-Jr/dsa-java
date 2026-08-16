import util.Assert;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/* LeetCode 102 — Binary Tree Level Order Traversal [Medium] | Tópico: Trees
 * Padrão: BFS com fila, guardando o tamanho da fila para separar níveis
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
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> esperado = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );
        Assert.equals(esperado, levelOrder(arvore), "exemplo do LeetCode");

        Assert.equals(new ArrayList<List<Integer>>(), levelOrder(null), "árvore vazia");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.equals(List.of(List.of(1)), levelOrder(soRaiz), "só a raiz");

        Assert.resumo();
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
