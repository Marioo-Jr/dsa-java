import util.Assert;

/* LeetCode 253 — Meeting Rooms II [Medium] | Tópico: Intervals
 * Padrão: dois arrays ordenados de inícios e fins (two pointers), ou min-heap dos fins ativos
 * Observação: problema premium/bloqueado no LeetCode, mas clássico da NeetCode 150.
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
public class MeetingRoomsII {

    public static void main(String[] args) {
        Assert.equals(2, minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}), "precisa de 2 salas simultâneas");
        Assert.equals(1, minMeetingRooms(new int[][]{{7, 10}, {2, 4}}), "sem overlap, 1 sala basta");
        Assert.equals(0, minMeetingRooms(new int[][]{}), "sem reuniões, 0 salas");
        Assert.equals(3, minMeetingRooms(new int[][]{{1, 10}, {2, 7}, {3, 19}, {8, 12}, {10, 20}, {11, 30}}), "pico de 3 reuniões simultâneas");
        Assert.resumo();
    }

    static int minMeetingRooms(int[][] intervals) {
        throw new UnsupportedOperationException("TODO");
    }
}
