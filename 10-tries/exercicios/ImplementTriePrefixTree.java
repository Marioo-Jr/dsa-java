import util.Assert;

/* LeetCode 208 — Implement Trie (Prefix Tree) [Medium] | Tópico: Tries
 * Padrão: árvore de 26 filhos (ou HashMap<Character,Node>) + flag de fim de palavra
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(tamanho da palavra) por operação  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class ImplementTriePrefixTree {

    public ImplementTriePrefixTree() {
        throw new UnsupportedOperationException("TODO");
    }

    public void insert(String word) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean search(String word) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean startsWith(String prefix) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        ImplementTriePrefixTree trie = new ImplementTriePrefixTree();
        trie.insert("apple");
        Assert.isTrue(trie.search("apple"), "apple foi inserida");
        Assert.isTrue(!trie.search("app"), "app não foi inserida como palavra completa");
        Assert.isTrue(trie.startsWith("app"), "app é um prefixo válido");
        trie.insert("app");
        Assert.isTrue(trie.search("app"), "app agora foi inserida");
        Assert.isTrue(!trie.search("appl"), "appl não é palavra completa");
        Assert.isTrue(!trie.startsWith("b"), "prefixo 'b' não existe");

        Assert.resumo();
    }
}
