package lambdas

//map _ reduce --> chamamos de map reduce

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
        Produto("Fichário escolar", 21.90),
        Produto("Lápis de cor", 11.90),
        Produto("Borracha bicolor", 0.70),
        Produto("Apontador com depósito", 1.80)
)

fun main(args: Array<String>) {
    //a função é um lambda
    val totalizar = { total: Double, atual: Double -> total + atual }

    //O primeiro elemento da fun passada pra dentro do reduce funciona como o acumulador, e
    //o segundo elemento é o valor que está sendo iterado naquele momento. No meu caso
    //O primeiro parâmetro é "total" --> acumulador da fun reduce
    //O segundo parâmetro pe atual -> valor iterado no momento
    //reduce recebe uma list e retorna um único elemento

    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)
    //fun map tranforma a lista de Produto em uma lista só de preços
    //Obs que dentro da fun reduze coloquei só o nome da variável, não precisei pôr o produto

    println("O preço médio é R$ ${precoTotal / materialEscolar.size}.")
}