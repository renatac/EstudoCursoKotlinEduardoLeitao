package lambdas

//Lambdas são funções anônimas que podem ser atribuídas ou armazenadas dentro de variáveis ou
//passados como parâmetros para outras funções. São funções não nomeadas. Sua chamada é feita noraml
//pelo nome da variável.
//É uma função não momeada armazenada em uma val, cujo o retorno é a última linha.

fun main(args: Array<String>) {
    val soma = { x: Int, y: Int -> x + y }       // função lambda
    println(soma(4, 6))

    val soma1 = {                           // função lambda. Obs que ela retorna a última linha dela smp
        x: Int, y: Int ->
        x + y
        2 }
    println(soma1(4, 6))
}