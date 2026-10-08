package com.example.interfaceifood.telas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.interfaceifood.componentes.CardLoja
import com.example.interfaceifood.dados.DadosApp


@Composable
fun TelaDetalheCategoria(navController: NavController, id: Int) {
    val categoria = DadosApp.buscarCategoria(id)

    if (categoria == null) {
        Text("Categoria não encontrada", modifier = Modifier.padding(16.dp))
        return
    }

    val lojasDaCategoria = DadosApp.lojas.filter { it.categoriaId == categoria.id }

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Column {
                Text(categoria.nome, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.headlineSmall)
                Text(categoria.descricao)
                Text("Quantidade de lojas: " + lojasDaCategoria.size)
            }
        }

        items(lojasDaCategoria) { loja ->
            CardLoja(loja) {
                navController.navigate("detalheLoja/${loja.id}")
            }
        }
    }
}