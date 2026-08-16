import util.Assert;
import java.util.List;

/* LeetCode 212 — Word Search II [Hard] | Tópico: Tries
 * Padrão: construir uma Trie com todas as palavras + DFS/backtracking na grade
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(m*n*4^L)  espaço O(soma dos tamanhos das palavras) para a Trie
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class WordSearchII {

    public static void main(String[] args) {
        char[][] board1 = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        List<String> r1 = findWords(board1, new String[]{"oath", "pea", "eat", "rain"});
        Assert.equals(2, r1.size(), "exemplo clássico -> 2 palavras encontradas");
        Assert.isTrue(r1.contains("oath"), "contém 'oath'");
        Assert.isTrue(r1.contains("eat"), "contém 'eat'");

        char[][] board2 = {
                {'a', 'b'},
                {'c', 'd'}
        };
        List<String> r2 = findWords(board2, new String[]{"abcb"});
        Assert.equals(0, r2.size(), "'abcb' reusaria a célula 'b' -> não encontrada");

        char[][] board3 = {{'a'}};
        List<String> r3 = findWords(board3, new String[]{"a"});
        Assert.equals(1, r3.size(), "tabuleiro 1x1 encontra palavra de 1 letra");
        Assert.isTrue(r3.contains("a"), "contém 'a'");

        Assert.resumo();
    }

    static List<String> findWords(char[][] board, String[] words) {
        throw new UnsupportedOperationException("TODO");
    }
}
