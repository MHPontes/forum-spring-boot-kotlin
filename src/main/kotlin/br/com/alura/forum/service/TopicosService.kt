package br.com.alura.forum.service


import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicosService (private var topicos: List<Topico>){

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
                t -> t.id == id
        }).findFirst().get()
    }

}
