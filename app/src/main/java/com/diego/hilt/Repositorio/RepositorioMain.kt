package com.diego.hilt.Repositorio

import com.diego.hilt.data.DataSource
import com.diego.hilt.listener.RespostaServidor
import javax.inject.Inject

class RepositorioMain @Inject constructor(private val dataSource: DataSource) {

    fun login(email: String, senha: String, respostaServidor: RespostaServidor){
        dataSource.login(email, senha, respostaServidor)
    }
}