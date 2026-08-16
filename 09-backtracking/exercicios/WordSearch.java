import util.Assert;

/* LeetCode 79 — Word Search [Medium] | Tópico: Backtracking
 * Padrão: DFS/backtracking na grade, marcando célula visitada e desmarcando ao voltar
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(m*n*4^L) onde L = tamanho da palavra  espaço O(L) de recursão
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class WordSearch {

    public static void main(String[] args) {
        char[][] board1 = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        Assert.isTrue(exist(board1, "ABCCED"), "ABCCED existe no tabuleiro");
        Assert.isTrue(exist(board1, "SEE"), "SEE existe no tabuleiro");
        Assert.isTrue(!exist(board1, "ABCB"), "ABCB não existe (reusaria a mesma célula B)");

        char[][] board2 = {{'A'}};
        Assert.isTrue(exist(board2, "A"), "tabuleiro 1x1 com a própria letra");
        Assert.isTrue(!exist(board2, "AB"), "tabuleiro 1x1 não contém palavra maior");

        Assert.resumo();
    }

    static boolean exist(char[][] board, String word) {
        throw new UnsupportedOperationException("TODO");
    }
}
