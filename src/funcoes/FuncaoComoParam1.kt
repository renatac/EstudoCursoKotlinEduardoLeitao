package funcoes

class Operacoes {
    fun somar(a: Int, b: Int): Int {  //Corpo de Bloco {return} - Obrigatoriedade do tipo xplícito do Retorno
        return a + b                   //da fun
    }
}

fun somar(a: Int, b: Int) = a + b    //Corpo de Expressão "=" retorno valor ou expressão, sem obrigatoriedade
                                     //do tipo de retorno da fun, inferência de tipos

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int) : Int {  //fun como parâmetro
    return funcao(a, b)
}
                                            //Como chamar funções dentro de funções
fun main(args: Array<String>) {
    println(calc(2, 3, Operacoes()::somar))    //Class()::fun
    println(calc(2, 3, ::somar))   //::fun
}