package funcoes

//Sempre que trabalho com fun inline passo uma função como parâmetro
inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação...")
    try {
        funcao()
    } finally {                         //É executado de qualquer maneira, no final
        println("fechando transação")
    }
}

fun main(args: Array<String>) {
    transacao{                                     // chamada da fun inline, poderia ter parêmetro tb
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
//    poderia ser assim:
//    transacao(){                                     // chamada da fun inline, poderia ter parêmetro tb
//        println("Executando SQL 1...")
//        println("Executando SQL 2...")
//        println("Executando SQL 3...")
//    }
//    ou assim
//            transacao({                                     // chamada da fun inline, poderia ter parêmetro tb
//                println("Executando SQL 1...")
//                println("Executando SQL 2...")
//                println("Executando SQL 3...")
//            }, 2)                                         //Se ela aceitasse outro parâmetro assim
                                                            //inline fun transacao(funcao: () -> Unit, num: Int)
}