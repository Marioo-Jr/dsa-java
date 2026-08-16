import util.Assert;
import java.util.*;

/* LeetCode 127 — Word Ladder [Hard] | Tópico: Graphs
 * Padrão: BFS num grafo implícito (palavras são nós, aresta se diferem em 1 letra)
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
public class WordLadder {

    public static void main(String[] args) {
        List<String> wordList1 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        Assert.equals(5, ladderLength("hit", "cog", wordList1), "hit->hot->dot->dog->cog (5 palavras)");

        List<String> wordList2 = Arrays.asList("hot", "dot", "dog", "lot", "log");
        Assert.equals(0, ladderLength("hit", "cog", wordList2), "endWord não está na wordList, impossível");

        Assert.equals(0, ladderLength("hit", "cog", new ArrayList<>()), "wordList vazia, impossível");

        Assert.resumo();
    }

    static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        throw new UnsupportedOperationException("TODO");
    }
}
