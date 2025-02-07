package com.diego.hilt.listener

interface RespostaServidor {

    fun onSucess(mensagem: String)
    fun onFailure(erro: String)
}