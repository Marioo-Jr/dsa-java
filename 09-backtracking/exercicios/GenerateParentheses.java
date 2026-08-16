import util.Assert;
import java.util.List;

/* LeetCode 22 — Generate Parentheses [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer, controlando contagem de '(' e ')' abertos
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(4^n / sqrt(n)) (número de Catalan)  espaço O(n) de recursão
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> r1 = generateParenthesis(3);
        Assert.equals(5, r1.size(), "n=3 -> 5 combinações válidas (Catalan(3))");
        Assert.isTrue(r1.contains("((()))"), "contém ((()))");
        Assert.isTrue(r1.contains("(()())"), "contém (()())");
        Assert.isTrue(r1.contains("()()()"), "contém ()()()");

        List<String> r2 = generateParenthesis(1);
        Assert.equals(1, r2.size(), "n=1 -> 1 combinação");
        Assert.isTrue(r2.contains("()"), "única combinação é ()");

        List<String> r3 = generateParenthesis(2);
        Assert.equals(2, r3.size(), "n=2 -> 2 combinações");
        Assert.isTrue(r3.contains("(())") && r3.contains("()()"), "contém (()) e ()()");

        Assert.resumo();
    }

    static List<String> generateParenthesis(int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
