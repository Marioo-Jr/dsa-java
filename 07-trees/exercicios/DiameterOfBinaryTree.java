import util.Assert;
import util.TreeNode;

/* LeetCode 543 — Diameter of Binary Tree [Easy] | Tópico: Trees
 * Padrão: DFS pós-ordem, calculando altura e atualizando um máximo global (altura esquerda + altura direita)
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
public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{1, 2, 3, 4, 5});
        Assert.equals(3, diameterOfBinaryTree(arvore), "exemplo do LeetCode (caminho 4-2-1-3 ou 5-2-1-3)");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.equals(0, diameterOfBinaryTree(soRaiz), "só a raiz não tem diâmetro");

        TreeNode doisNos = TreeNode.deArray(new Integer[]{1, 2});
        Assert.equals(1, diameterOfBinaryTree(doisNos), "dois nós, uma aresta");

        Assert.equals(0, diameterOfBinaryTree(null), "árvore vazia");

        Assert.resumo();
    }

    static int diameterOfBinaryTree(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }
}
