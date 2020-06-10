package fundamentos.operadores

//Operadores Unários

fun main(args: Array<String>) {
    var num1: Int = 1
    var num2: Int = 2

    num1++   //obs que modifica o valor na variável . Operador pós-fixado
    println(num1)
    --num1    //obs que modifica o valor na variável . Operador pré-fixado
    println(num1)

    var numero = 2
    println(numero)
    // Incremento e decremento
    println(++numero)
    println(numero--)
    println(numero)
    println(++numero == numero--) //++num tem precedência sobre ==, logo ele vai ser feito antes da comparação
    //já o numero-- não tem precedência sobre ==, logo vai ser feito depois da comparação
    println(num1 == num2)
}