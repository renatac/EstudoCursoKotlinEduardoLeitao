package lambdas

//Interface
interface Operacao {
    fun executar(a: Int, b: Int): Int
}

//Implementa a interface Operacao
class Multiplicacao: Operacao {
    //tá implementando a fun Operacao da interface Operacao
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {

    //por padrão retorna a soma
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    //sobrecarga da função calcular
    //pode ser uma fun que faz soma, subtraçao etc, dependendo do que eu passar nessa função
    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    //sobrecarga da função calcular
    //Usando lambida fica mais fácil
    //o parâmetro recebe uma função lambda , o que resolve tudo!
    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    val resultado1 = calculadora.calcular(3, 4)

                                         //Implementa a interface Operacao
    val resultado2 = calculadora.calcular(3, 4, Multiplicacao())

    val subtracao = { a: Int, b: Int -> a - b }
    val resultado3 = calculadora.calcular(3, 4, subtracao)

    println("$resultado1 $resultado2 $resultado3")
}