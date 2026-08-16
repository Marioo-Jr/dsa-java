import util.Assert;

/* LeetCode 211 — Design Add and Search Words Data Structure [Medium] | Tópico: Tries
 * Padrão: Trie + DFS no search para tratar '.' como coringa de qualquer letra
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  addWord O(L)  search O(26^L) no pior caso (muitos '.')  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class DesignAddAndSearchWordsDataStructure {

    public DesignAddAndSearchWordsDataStructure() {
        throw new UnsupportedOperationException("TODO");
    }

    public void addWord(String word) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean search(String word) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        DesignAddAndSearchWordsDataStructure wd = new DesignAddAndSearchWordsDataStructure();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");

        Assert.isTrue(!wd.search("pad"), "'pad' não foi adicionada");
        Assert.isTrue(wd.search("bad"), "'bad' foi adicionada");
        Assert.isTrue(wd.search(".ad"), "'.ad' casa com bad/dad/mad");
        Assert.isTrue(wd.search("b.."), "'b..' casa com bad");
        Assert.isTrue(!wd.search("b.a"), "'b.a' não casa com nenhuma palavra (tamanho errado)");
        Assert.isTrue(wd.search("..."), "'...' com 3 pontos casa com qualquer palavra de 3 letras");
        Assert.isTrue(!wd.search("...."), "'....' com 4 pontos não casa (todas as palavras têm 3 letras)");

        Assert.resumo();
    }
}
