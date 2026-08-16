package util;

import java.util.Arrays;

/**
 * Helper mínimo de teste — sem dependências externas, sem download.
 * Uso típico dentro do main() de um exercício:
 *
 *   Assert.equals(2, minhaFuncao(1, 1), "soma simples");
 *   Assert.resumo();
 */
public final class Assert {

    private static int total = 0;
    private static int falhas = 0;

    private Assert() {}

    public static void equals(Object esperado, Object obtido, String descricao) {
        total++;
        boolean ok = (esperado == null && obtido == null) || (esperado != null && esperado.equals(obtido));
        if (ok) {
            System.out.println("  OK   " + descricao);
        } else {
            falhas++;
            System.out.println("  FALHOU " + descricao
                    + " | esperado=" + esperado + " obtido=" + obtido);
        }
    }

    public static void arrayEquals(int[] esperado, int[] obtido, String descricao) {
        total++;
        boolean ok = Arrays.equals(esperado, obtido);
        if (ok) {
            System.out.println("  OK   " + descricao);
        } else {
            falhas++;
            System.out.println("  FALHOU " + descricao
                    + " | esperado=" + Arrays.toString(esperado)
                    + " obtido=" + Arrays.toString(obtido));
        }
    }

    public static void isTrue(boolean condicao, String descricao) {
        total++;
        if (condicao) {
            System.out.println("  OK   " + descricao);
        } else {
            falhas++;
            System.out.println("  FALHOU " + descricao);
        }
    }

    /** Chame no fim do main() para ver o placar e sair com código de erro se algo falhou. */
    public static void resumo() {
        System.out.println("----");
        System.out.println((total - falhas) + "/" + total + " passaram");
        if (falhas > 0) {
            System.out.println(falhas + " FALHA(S) — implemente os TODOs pendentes.");
            System.exit(1);
        }
    }
}
