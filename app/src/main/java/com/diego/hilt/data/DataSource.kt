package com.diego.hilt.data

import com.diego.hilt.listener.RespostaServidor

class DataSource {
    fun login(email:String, senha:String, respostaServidor: RespostaServidor){
        if(email.isEmpty() || senha.isEmpty()){
            respostaServidor.onFailure("Preencha todos os campos!")
        }else if (email == "admin@gmail.com" && senha == "123456") {
            respostaServidor.onSucess("Sucesso ao fazer o login!")
        }else{
            respostaServidor.onFailure("Falhou ao fazer o login no sistema!")
        }
    }
}