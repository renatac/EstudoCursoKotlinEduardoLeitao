package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 8.99
    val nota2: Float = 8.99f // se fosse float, seria assim!

    // Usando operador range
    if (nota in 9..10) {           // pode converter para (9 <= nota && nota <= 10), já que o in está deprecate
        println("Fantástico")
    } else if (nota in 7..8) {
        println("Parabéns")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }

    println(5 in 7..4)  //false --> Range só é do menor para o maior

    for(n in 7..4){    // Não printa nada porque isso não pode ser feito. Operador range é smp do menor p/ maior
        println(n)
    }
    println(5 in 4..7) // true
}