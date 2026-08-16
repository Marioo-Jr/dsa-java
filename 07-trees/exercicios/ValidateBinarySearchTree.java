import util.Assert;
import util.TreeNode;

/* LeetCode 98 — Validate Binary Search Tree [Medium] | Tópico: Trees
 * Padrão: DFS carregando limites (min, max) válidos para cada nó, em vez de só comparar com os filhos diretos
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
public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode valida = TreeNode.deArray(new Integer[]{2, 1, 3});
        Assert.isTrue(isValidBST(valida), "exemplo válido do LeetCode");

        TreeNode invalida = TreeNode.deArray(new Integer[]{5, 1, 4, null, null, 3, 6});
        Assert.isTrue(!isValidBST(invalida), "exemplo inválido do LeetCode (4 tem filho 3, mas 3 < 5)");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.isTrue(isValidBST(soRaiz), "só a raiz é sempre válida");

        // armadilha clássica: comparar só com o pai direto não é suficiente
        TreeNode armadilha = TreeNode.deArray(new Integer[]{10, 5, 15, null, null, 6, 20});
        Assert.isTrue(!isValidBST(armadilha), "6 é filho esquerdo de 15, mas 6 < 10 (viola o limite global)");

        Assert.resumo();
    }

    static boolean isValidBST(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
