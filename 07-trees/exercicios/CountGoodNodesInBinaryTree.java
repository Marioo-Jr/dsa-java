import util.Assert;
import util.TreeNode;

/* LeetCode 1448 — Count Good Nodes In Binary Tree [Medium] | Tópico: Trees
 * Padrão: DFS carregando o maior valor visto no caminho da raiz até o nó atual
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
public class CountGoodNodesInBinaryTree {

    public static void main(String[] args) {
        TreeNode arvore1 = TreeNode.deArray(new Integer[]{3, 1, 4, 3, null, 1, 5});
        Assert.equals(4, goodNodes(arvore1), "exemplo 1 do LeetCode");

        TreeNode arvore2 = TreeNode.deArray(new Integer[]{3, 3, null, 4, 2});
        Assert.equals(3, goodNodes(arvore2), "exemplo 2 do LeetCode");

        TreeNode arvore3 = TreeNode.deArray(new Integer[]{1});
        Assert.equals(1, goodNodes(arvore3), "só a raiz é sempre um nó bom");

        Assert.resumo();
    }

    static int goodNodes(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
