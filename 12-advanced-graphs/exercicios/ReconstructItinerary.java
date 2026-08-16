import util.Assert;
import java.util.*;

/* LeetCode 332 — Reconstruct Itinerary [Hard] | Tópico: Advanced Graphs
 * Padrão: Euler Path (DFS com backtracking / algoritmo de Hierholzer), escolhendo sempre o destino lexicograficamente menor
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
public class ReconstructItinerary {

    public static void main(String[] args) {
        List<List<String>> tickets1 = Arrays.asList(
                Arrays.asList("MUC", "LHR"),
                Arrays.asList("JFK", "MUC"),
                Arrays.asList("SFO", "SJC"),
                Arrays.asList("LHR", "SFO")
        );
        Assert.equals(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"),
                findItinerary(tickets1), "itinerário único usando todos os tickets");

        List<List<String>> tickets2 = Arrays.asList(
                Arrays.asList("JFK", "SFO"),
                Arrays.asList("JFK", "ATL"),
                Arrays.asList("SFO", "ATL"),
                Arrays.asList("ATL", "JFK"),
                Arrays.asList("ATL", "SFO")
        );
        Assert.equals(Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
                findItinerary(tickets2), "escolhe ATL antes de SFO por ordem lexicográfica");

        Assert.resumo();
    }

    static List<String> findItinerary(List<List<String>> tickets) {
        throw new UnsupportedOperationException("TODO");
    }
}
