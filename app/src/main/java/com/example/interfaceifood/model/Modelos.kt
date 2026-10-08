package com.example.interfaceifood.model



data class Categoria(
    val id: Int,
    val nome: String,
    val descricao: String
)

data class Loja(
    val id: Int,
    val nome: String,
    val categoriaId: Int,
    val avaliacao: Double,
    val tempoEntrega: String,
    val taxaEntrega: Double,
    val favorita: Boolean = false
)


fun textoTaxa(taxa: Double): String {
    if (taxa == 0.0) {
        return "Entrega Grátis"
    }
    return "Entrega R$ " + taxa
}