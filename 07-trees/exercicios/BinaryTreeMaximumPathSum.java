import util.Assert;
import util.TreeNode;

/* LeetCode 124 — Binary Tree Maximum Path Sum [Hard] | Tópico: Trees
 * Padrão: DFS pós-ordem retornando o melhor "ramo" (caminho que sai do nó e desce só para
 * um lado, útil pro pai), enquanto atualiza um máximo global considerando os dois lados juntos
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
public class BinaryTreeMaximumPathSum {

    public static void main(String[] args) {
        TreeNode arvore1 = TreeNode.deArray(new Integer[]{1, 2, 3});
        Assert.equals(6, maxPathSum(arvore1), "exemplo 1 do LeetCode (2+1+3)");

        TreeNode arvore2 = TreeNode.deArray(new Integer[]{-10, 9, 20, null, null, 15, 7});
        Assert.equals(42, maxPathSum(arvore2), "exemplo 2 do LeetCode (15+20+7)");

        TreeNode soNegativos = TreeNode.deArray(new Integer[]{-3});
        Assert.equals(-3, maxPathSum(soNegativos), "só a raiz negativa: o caminho é obrigatoriamente ela mesma");

        TreeNode comNegativos = TreeNode.deArray(new Integer[]{2, -1});
        Assert.equals(2, maxPathSum(comNegativos), "melhor não incluir o filho negativo");

        Assert.resumo();
    }

    static int maxPathSum(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
