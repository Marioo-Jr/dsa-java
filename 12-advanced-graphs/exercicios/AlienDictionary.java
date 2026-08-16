import util.Assert;

/* LeetCode 269 — Alien Dictionary [Hard] | Tópico: Advanced Graphs
 * Padrão: Ordenação topológica (Kahn's) sobre grafo de precedência entre letras
 *
 * NOTA: este problema é bloqueado/premium no LeetCode, mas é padrão e
 * conhecido — usando o enunciado clássico: words já vem ordenada segundo o
 * alfabeto alienígena; compare palavras adjacentes para descobrir qual
 * letra vem antes de qual.
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
public class AlienDictionary {

    public static void main(String[] args) {
        Assert.equals("wertf", alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}), "exemplo clássico LC 269");

        Assert.equals("zx", alienOrder(new String[]{"z", "x"}), "duas palavras, z antes de x");

        Assert.equals("", alienOrder(new String[]{"z", "x", "z"}), "ordem inconsistente (z antes de x antes de z) é inválida");

        Assert.equals("", alienOrder(new String[]{"abc", "ab"}), "prefixo mais longo antes do curto é inválido");

        Assert.resumo();
    }

    static String alienOrder(String[] words) {
        throw new UnsupportedOperationException("TODO");
    }
}
