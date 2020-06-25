package fundamentos

//função com retorno
//Paradigma funcional é mais antigo que o paradigma de orientação objeto.
//O paradigma funcional tinha deixado de ser usado por questão de desempenho e da forma que opera.
//Hj não temos problema de memória, ou uso de memória racional.

//Kotlin trá benefícios do mundo das funções

fun soma(a: Int, b: Int = 1): Int {         //Corpo de bloco {}
    return a + b
}

fun main(args: Array<String>) {
    println(soma(2, 3))
    println(soma(11))
}