import util.Assert;

/* LeetCode 252 — Meeting Rooms [Easy] | Tópico: Intervals
 * Padrão: ordenar por início, verificar se algum intervalo começa antes do anterior terminar
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
public class MeetingRooms {

    public static void main(String[] args) {
        Assert.isTrue(!canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}}), "reuniões [0,30] e [5,10] se sobrepõem");
        Assert.isTrue(canAttendMeetings(new int[][]{{7, 10}, {2, 4}}), "sem overlap, pode participar de todas");
        Assert.isTrue(canAttendMeetings(new int[][]{}), "sem reuniões, trivialmente true");
        Assert.isTrue(canAttendMeetings(new int[][]{{5, 8}, {8, 10}}), "reuniões que só se tocam na ponta não são overlap");
        Assert.resumo();
    }

    static boolean canAttendMeetings(int[][] intervals) {
        throw new UnsupportedOperationException("TODO");
    }
}
