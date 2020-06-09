package fundamentos.controles

fun main(args: Array<String>) {
    for(i in 1..10) {
        if(i == 5) {
            continue              // Ao chegar aqui, ele não executa mais nenhuma linha de código abaixo,
        }                         // ele vai pro próximo laço da iteração.
        println("Atual: $i")
    }
}