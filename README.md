# Interface iFood — Trabalho 2 (MAF: Mínimo Aplicativo Funcional)

App Android em **Kotlin + Jetpack Compose** inspirado no iFood. É a continuação do
Trabalho 1 ([InterfaceIfood2](https://github.com/LucasHartinger19/InterfaceIfood2)):
as 3 telas que antes eram só visuais agora navegam de verdade, e o app ganhou listas
de **Lojas** e **Categorias** em que dá para adicionar, remover, editar e ver detalhes.

Integrantes: Lucas Pereira Hartinger
               Luis Felipe de Paula Fogaça
               Felipe Paulista Silveira




## Telas (7 navegáveis)

| # | Tela | Origem | O que faz |
|---|------|--------|-----------|
| 1 | **Início** | Trabalho 1, evoluída | Busca (envia o texto para a tela de Busca), chips de categoria que abrem o Detalhe da Categoria, top 4 lojas por nota, atalho para o pedido |
| 2 | **Busca** | Trabalho 1, evoluída | Filtra as lojas pelo nome ou categoria e por filtros reais (melhor avaliação, mais rápido, entrega grátis, favoritas) |
| 3 | **Acompanhar Pedido** | Trabalho 1, evoluída | Mostra o pedido feito no Detalhe da Loja, barra de progresso, botão para avançar o status, cancelar/finalizar e ajuda |
| 4 | **Lista de Lojas** | Nova | `LazyColumn` + `Card`; formulário para adicionar; lixeira para remover; coração para favoritar |
| 5 | **Detalhe da Loja** | Nova | Dados da loja + categoria, ranking, edição da nota, simulador de total e botão "Fazer pedido" |
| 6 | **Lista de Categorias** | Nova | `LazyColumn` + `Card`; formulário com campo de várias linhas; **segurar** o card remove |
| 7 | **Detalhe da Categoria** | Nova | Estatísticas calculadas, lojas da categoria e edição de nome/descrição |

A **NavigationBar** (barra inferior) dá acesso a Início, Busca, Lojas, Categorias e Pedido.
As telas de detalhe e as listas usam **TopAppBar** com botão de voltar (`popBackStack()`).


## Estrutura do código

```
app/src/main/java/com/example/interfaceifood/
├── MainActivity.kt            → só chama AppNavigation() dentro do tema
├── model/Modelos.kt           → data classes Loja e Categoria + formatação (R$, nota)
├── dados/DadosApp.kt          → listas reativas (mutableStateListOf) e funções de add/remover/editar
├── navegacao/
│   ├── Rotas.kt               → object Rotas com as rotas em const val String
│   └── AppNavigation.kt       → Scaffold + NavHost central + NavigationBar
├── componentes/Componentes.kt → BarraTopo (TopAppBar), CardLoja, AvatarLetra, LinhaInfo...
├── telas/                     → uma tela por arquivo
└── ui/theme/Theme.kt          → cores do app (vermelho iFood)
```


