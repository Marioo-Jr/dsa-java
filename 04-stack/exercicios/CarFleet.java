import util.Assert;

/* LeetCode 853 — Car Fleet [Medium] | Tópico: Stack
 * Padrão: ordenar por posição + pilha de tempos de chegada (frota se forma
 * quando um carro de trás alcançaria o da frente antes dele)
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
public class CarFleet {

    public static void main(String[] args) {
        Assert.equals(3, carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}), "caso clássico do enunciado");
        Assert.equals(1, carFleet(10, new int[]{3}, new int[]{3}), "um único carro é uma frota");
        Assert.equals(1, carFleet(100, new int[]{0, 2, 4}, new int[]{4, 2, 1}), "todos se juntam numa frota só");
        Assert.resumo();
    }

    // position[i] e speed[i] descrevem o carro i. Todos viajam para
    // `target`. Carros não se ultrapassam (formam frota e viajam juntos na
    // velocidade do mais lento à frente). Retorna o número de frotas que
    // chegam ao destino.
    static int carFleet(int target, int[] position, int[] speed) {
        throw new UnsupportedOperationException("TODO");
    }
}
