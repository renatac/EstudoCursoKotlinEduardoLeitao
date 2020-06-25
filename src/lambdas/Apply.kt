package lambdas

//A fun apply recebe como parâmetro um lambda
//Obs que no apply não temos o it como é o caso do let

class Calculadora2 {
    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(valor: Int) {
        resultado += valor
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora2()        // recebe uma instância de Calculadora2

    //é parecido com o . do java, mas pra o print foi diferente
    calculadora.apply { soma(4, 5) }.apply { add(5) }.apply { println(resultado) }

    calculadora.apply {
        soma(4, 5)
        add(5)
        println(resultado)
    }

    // inline function
    with(calculadora) {
        soma(4, 5)
        add(5)
        println(resultado)
    }
    // inline function
    with(calculadora , {
        soma(4, 5)
        add(5)
        println(resultado)
    })
}