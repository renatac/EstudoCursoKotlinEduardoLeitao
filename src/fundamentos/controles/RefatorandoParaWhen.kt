package fundamentos.controles

fun main(args: Array<String>) {
    val nota = -3

    //when precisa ser exaustivo, ou seja, deve contemplar todos os possíveis casos
    when(nota) {
        10, 9 -> print("Fantástico")
        8, 7 -> print("Parabéns")
        6, 5, 4 -> print("Tem como recuperar")
        in 0..3 -> print("Te vejo no próximo semestre")
        else -> print("Nota inválida")
    }
}