package funcoes

//Retorna o Tipo de retorno que a função que a fun inline recebe, por isso o T - Tipo Genérico, poderia ser
//outra letra                                           //fun sem parâmetro ()
inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int {          //Corpo de Bloco {}, obrigatoriedade
    return a + b                           //do tipo de retorno da fun
}

fun main(args: Array<String>) {
    val resultado = executarComLog("somar") { //função lambida, a úlitma linha de código é
        somar2(4, 5) //{função anônima}            //é o que retorna. Retorno da função lambda implícito
    }                                                     //da última linha
    //Obs que lá na chamada de executarComLog eu disse que a função que eu passaria seria sem parâmetro
    //então posso colocar somar2(4,5) só pq ela é o retorno do lambda

    println(resultado)
}