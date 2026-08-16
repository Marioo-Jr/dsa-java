import util.Assert;
import java.util.ArrayList;
import java.util.List;

/* Teoria — Backtracking base (gerar todas as strings binárias de tamanho n)
 * Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer (choose / explore / unchoose)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Objetivo desta lição: fixar o esqueleto de backtracking antes dos
 * exercícios de verdade. Para cada posição da string, escolho '0' ou '1',
 * recurso para a próxima posição, e desfaço a escolha (removo o último
 * caractere) antes de tentar a próxima opção.
 *
 * Exemplo: n=2 -> ["00", "01", "10", "11"] (ordem pode variar)
 *
 * Complexidade:  tempo O(2^n)  espaço O(n) de recursão (fora a saída)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class BacktrackingBase {

    public static void main(String[] args) {
        List<String> r0 = generateBinaryStrings(0);
        Assert.equals(1, r0.size(), "n=0 -> só a string vazia");

        List<String> r1 = generateBinaryStrings(1);
        Assert.equals(2, r1.size(), "n=1 -> 2 strings");
        Assert.isTrue(r1.contains("0") && r1.contains("1"), "n=1 contém '0' e '1'");

        List<String> r2 = generateBinaryStrings(2);
        Assert.equals(4, r2.size(), "n=2 -> 4 strings");
        Assert.isTrue(r2.contains("00") && r2.contains("01") && r2.contains("10") && r2.contains("11"),
                "n=2 contém todas as combinações");

        List<String> r3 = generateBinaryStrings(3);
        Assert.equals(8, r3.size(), "n=3 -> 8 strings (2^3)");

        Assert.resumo();
    }

    static List<String> generateBinaryStrings(int n) {
        List<String> resultado = new ArrayList<>();
        // TODO: backtracking (choose / explore / unchoose) usando um StringBuilder
        throw new UnsupportedOperationException("TODO");
    }
}
