# DSA em Java — Trilha NeetCode + Nick White

Repositório de estudo para melhorar lógica de programação via DSA, em Java, seguindo a
ordem do [NeetCode Roadmap](https://neetcode.io/roadmap) com teoria antes de cada bloco
de exercícios.

## Setup (uma vez só)

Requer JDK 22+ (você tem JDK 25 Temurin — ok). Sem Maven, sem downloads.

```bash
cd dsa-java
javac util/Assert.java
```

Isso gera `util/Assert.class`, usado pelos testes de todo exercício (arquivo já está no
`.gitignore`, não precisa recompilar depois de puxar o repo de novo — só se apagar).

## Como rodar um exercício

De dentro de `dsa-java/`:

```bash
java -cp . 01-arrays-hashing/exercicios/ContainsDuplicate.java
```

Isso compila e roda o arquivo na hora (source-launcher do JDK), imprimindo os casos de
teste do `main()`. `-cp .` é o que permite o arquivo achar `util.Assert` mesmo estando em
outra pasta.

## O método: o bloco de 1 hora

```
10 min  →  REVISÃO   : /revisao diz 1 problema antigo. Refaça DO ZERO, sem olhar.
40 min  →  ITEM DO DIA: uma lição de teoria + implementação, OU 1-2 exercícios.
10 min  →  REGISTRO  : anote no arquivo o que travou, a ideia em 3 linhas, a complexidade.
```

### Regra dos 30 minutos

Nunca abra a solução direto. A escada:

1. **0-30 min** sozinho. Antes de codar, escreva a ideia em 3 linhas no topo do arquivo.
2. `/dica <problema>` nível 1 — qual estrutura considerar.
3. `/dica <problema>` nível 2 — a ideia central.
4. `/dica <problema>` nível 3 — pseudocódigo (você ainda escreve o Java).
5. Só então o vídeo do Nick White — link em `PLAYLIST_INDEX.md`.

Como você resolveu define o `status` que anota no arquivo (`sozinho` / `com dica` /
`viu o vídeo`) — isso alimenta a revisão espaçada.

## Estrutura

```
util/Assert.java        # helper de teste, zero dependências
util/ListNode.java       # nó de lista ligada (formato LeetCode) + deArray/paraArray
util/TreeNode.java       # nó de árvore binária (formato LeetCode) + deArray/paraArray
_template/Problema.java # modelo para criar exercícios novos
00-fundamentos/         # arrays, recursão, ordenação — a base
01-arrays-hashing/      # teoria/ (esqueletos com TODO) + exercicios/ + NOTAS.md
02-two-pointers/ ... 18-bit-manipulation/  # mesmo molde, um por tópico do roadmap
ROADMAP.md              # a trilha inteira, tópico por tópico, com checkboxes
PLAYLIST_INDEX.md       # problema -> vídeo do Nick White (ou fallback), os 150
progresso.csv           # tracker para a revisão espaçada
```

O número na frente de cada pasta (`00`, `01`, `02`, ...) é a ordem de estudo — segue
exatamente a ordem do `ROADMAP.md`. Dentro de cada tópico: teoria primeiro
(`teoria/`), depois os exercícios (`exercicios/`), depois `NOTAS.md`.

## Comandos

- `/teoria <tópico ou lição>` — explica em PT-BR com analogia/diagrama e termina com
  perguntas de recall ativo.
- `/dica <problema>` — uma dica por vez, sobe de nível a cada chamada, nunca entrega a
  solução em Java.
- `/revisao` — olha `progresso.csv` e diz qual problema refazer hoje (D+2/D+7/D+21).

## Revisão espaçada

Intervalos a partir da primeira resolução: `sozinho` → 21 dias · `com dica` → 7 dias ·
`viu o vídeo` → 3 dias. Refazer = apagar o corpo do método e reescrever, não reler.
