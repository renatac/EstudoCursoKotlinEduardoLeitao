package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 1..10) {                   //1 até 10, com 1 e 10 inclusos
        if(i == 5) {
            break                            // break faz sair do laço mais interno, como aí só tem um for, sai dele
        }
        println("Atual: $i")
    }
    println("Fim!")
}