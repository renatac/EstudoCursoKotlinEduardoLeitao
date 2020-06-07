package funcoes

import java.util.*

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance()

    //é uma função inline, pra eu não ter que fazer Horario(agora.get(Calendar.HOUR),...)
    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
    //criei uma instância de Horário com a hora atual
}

fun main(args: Array<String>) {
    val (h, m, s) = agora()   //Operador Destructuring para extrair o valor para as constantes h, m e s
    println("$h:$m:$s")       //Template string para imprimir o valor das ctes
}