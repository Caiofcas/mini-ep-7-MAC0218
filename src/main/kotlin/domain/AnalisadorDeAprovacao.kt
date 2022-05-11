package domain
import domain.criterios.CriterioDeAprovacao
import domain.Boletim
import domain.BoletimFechado

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    lateinit var criterio_atual: CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        criterio_atual = criterio
    }

    fun fechaBoletim(boletim: Boletim): BoletimFechado {
        return BoletimFechado(
            mediaFinal=criterio_atual.mediaFinal(boletim), 
            foiAprovado=criterio_atual.estaAprovado(boletim), 
            mediaEPs=boletim.mediaEPs, 
            mediaMiniEPs=boletim.mediaMiniEPs
        )
    }

    fun mediaMiniEPs(): Double {
        return 0.0
    }

    fun mediaEPs(): Double {
        return 0.0

    }

    fun mediaFinal(): Double {
        return 0.0

    }

    fun foiAprovado(): Boolean {
        return false
    }

}