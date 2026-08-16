import util.Assert;
import util.TreeNode;

/* LeetCode 235 — Lowest Common Ancestor of a Binary Search Tree [Medium] | Tópico: Trees
 * Padrão: usa a propriedade da BST (esquerda < nó < direita) para descer direto no caminho certo
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
public class LowestCommonAncestorOfABST {

    public static void main(String[] args) {
        TreeNode raiz = TreeNode.deArray(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});

        Assert.equals(6, lowestCommonAncestor(raiz, encontrar(raiz, 2), encontrar(raiz, 8)).val, "LCA de 2 e 8 é a raiz");
        Assert.equals(2, lowestCommonAncestor(raiz, encontrar(raiz, 2), encontrar(raiz, 4)).val, "LCA de 2 e 4 é o próprio 2 (ancestral de si mesmo)");
        Assert.equals(4, lowestCommonAncestor(raiz, encontrar(raiz, 3), encontrar(raiz, 5)).val, "LCA de 3 e 5 é o 4");

        TreeNode duasFolhas = TreeNode.deArray(new Integer[]{2, 1});
        Assert.equals(2, lowestCommonAncestor(duasFolhas, encontrar(duasFolhas, 1), encontrar(duasFolhas, 2)).val, "LCA de nó e seu ancestral direto");

        Assert.resumo();
    }

    // busca um nó pelo valor usando a propriedade de BST (só para montar os testes)
    static TreeNode encontrar(TreeNode root, int valor) {
        if (root == null || root.val == valor) return root;
        return valor < root.val ? encontrar(root.left, valor) : encontrar(root.right, valor);
    }

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        throw new UnsupportedOperationException("TODO");
    }
}
