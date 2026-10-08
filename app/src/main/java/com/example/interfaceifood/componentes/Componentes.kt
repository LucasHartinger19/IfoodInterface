package com.example.interfaceifood.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.interfaceifood.dados.DadosApp
import com.example.interfaceifood.model.Loja
import com.example.interfaceifood.model.textoTaxa

@Composable
fun CardLoja(loja: Loja, aoClicar: () -> Unit) {
    Card(modifier = Modifier.fillMaxWidth().clickable { aoClicar() }) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(loja.nome, fontWeight = FontWeight.Bold)
            Text(loja.avaliacao.toString() + " - " + DadosApp.nomeCategoria(loja.categoriaId))
            Text(loja.tempoEntrega + " - " + textoTaxa(loja.taxaEntrega))
        }
    }
}