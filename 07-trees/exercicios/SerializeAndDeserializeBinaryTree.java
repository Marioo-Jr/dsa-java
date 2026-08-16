import util.Assert;
import util.TreeNode;

/* LeetCode 297 — Serialize And Deserialize Binary Tree [Hard] | Tópico: Trees
 * Padrão: DFS preorder, usando um marcador (ex: "#" ou "null") para os filhos ausentes,
 * de forma que a estrutura dê pra reconstruir sem ambiguidade
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
public class SerializeAndDeserializeBinaryTree {

    public String serialize(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    public TreeNode deserialize(String data) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree codec = new SerializeAndDeserializeBinaryTree();

        TreeNode arvore1 = TreeNode.deArray(new Integer[]{1, 2, 3, null, null, 4, 5});
        TreeNode idaEVolta1 = codec.deserialize(codec.serialize(arvore1));
        Assert.equals(TreeNode.paraArray(arvore1), TreeNode.paraArray(idaEVolta1), "árvore de exemplo do LeetCode sobrevive ao round-trip");

        TreeNode vazia = null;
        Assert.equals(null, codec.deserialize(codec.serialize(vazia)), "árvore vazia sobrevive ao round-trip");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.equals(TreeNode.paraArray(soRaiz), TreeNode.paraArray(codec.deserialize(codec.serialize(soRaiz))), "só a raiz sobrevive ao round-trip");

        TreeNode comNegativos = TreeNode.deArray(new Integer[]{-1, -2, -3});
        Assert.equals(TreeNode.paraArray(comNegativos), TreeNode.paraArray(codec.deserialize(codec.serialize(comNegativos))), "valores negativos sobrevivem (cuidado com o separador escolhido)");

        Assert.resumo();
    }
}
