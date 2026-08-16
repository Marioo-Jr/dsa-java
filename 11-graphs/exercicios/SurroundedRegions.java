import util.Assert;

/* LeetCode 130 — Surrounded Regions [Medium] | Tópico: Graphs
 * Padrão: DFS/BFS a partir da borda (marcar o que NÃO deve ser capturado)
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
public class SurroundedRegions {

    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] esperado = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        solve(board);
        for (int i = 0; i < board.length; i++) {
            Assert.equals(new String(esperado[i]), new String(board[i]), "linha " + i + " após captura");
        }

        char[][] tudoBorda = {
                {'O', 'O'},
                {'O', 'O'}
        };
        char[][] esperadoTudoBorda = {
                {'O', 'O'},
                {'O', 'O'}
        };
        solve(tudoBorda);
        Assert.equals(new String(esperadoTudoBorda[0]), new String(tudoBorda[0]), "tudo na borda, nada é capturado (linha 0)");
        Assert.equals(new String(esperadoTudoBorda[1]), new String(tudoBorda[1]), "tudo na borda, nada é capturado (linha 1)");

        Assert.resumo();
    }

    static void solve(char[][] board) {
        throw new UnsupportedOperationException("TODO");
    }
}
