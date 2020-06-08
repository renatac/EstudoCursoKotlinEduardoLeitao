package lambdas

//takeIf

fun main(args: Array<String>) {
    println("Digite sua mensagem: ")

    val entrada = readLine()  //Aqui tenho uma resposta que é uma String opcional--> usar o null safe
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"
    // ?.  Null Safe Operator
    // ?:  Elvis Operator
    // entrada.takeIf { it?.trim() != "" } significa:
    // Se o que foi colocado dentro da fun lambda for verdadeiro retorno a entrada
    // Se não for verdadeiro, retorno null
    // Se entrada diferente de String vazia, retorne entrada, senão retorne null
    // it?.trim()  : Significa: se entrada diferente de null faça .trim() --> tire os espaços do começo e fim.
    // Isso de cima é o null safe call, pra que o método trim() não quebre a aplicação sendo chamado em algo
    //null. Tem que ter a garantia de que não é null pra poder chamar a .trim()
    // ?:  Significa: se null imprima a msg default  "Sem mensagem"
    println(mensagem)
}