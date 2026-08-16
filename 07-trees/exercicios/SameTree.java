import util.Assert;
import util.TreeNode;

/* LeetCode 100 — Same Tree [Easy] | Tópico: Trees
 * Padrão: DFS recursivo, comparando estrutura e valores nó a nó
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
public class SameTree {

    public static void main(String[] args) {
        TreeNode p1 = TreeNode.deArray(new Integer[]{1, 2, 3});
        TreeNode q1 = TreeNode.deArray(new Integer[]{1, 2, 3});
        Assert.isTrue(isSameTree(p1, q1), "árvores idênticas");

        TreeNode p2 = TreeNode.deArray(new Integer[]{1, 2});
        TreeNode q2 = TreeNode.deArray(new Integer[]{1, null, 2});
        Assert.isTrue(!isSameTree(p2, q2), "mesmos valores, formato diferente (esquerda vs direita)");

        TreeNode p3 = TreeNode.deArray(new Integer[]{1, 2, 1});
        TreeNode q3 = TreeNode.deArray(new Integer[]{1, 1, 2});
        Assert.isTrue(!isSameTree(p3, q3), "mesmo formato, valores diferentes");

        Assert.isTrue(isSameTree(null, null), "duas árvores vazias são iguais");
        Assert.isTrue(!isSameTree(TreeNode.deArray(new Integer[]{1}), null), "uma vazia e outra não");

        Assert.resumo();
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        throw new UnsupportedOperationException("TODO");
    }
}
