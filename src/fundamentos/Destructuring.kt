package fundamentos

//Operador Destructuring, não tem no java.
//Operador de desestruturação - tira de dentro de uma estrutura alguma coisa. Um Elemento de uma lista, atributos de um objeto.

fun main(args: Array<String>) {

val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")

val (a,b,c,d, e) = nomes     // Destructuring
println("a = $a \nb = $b \nc = $c \nd = $d \ne = $e")   //Templates Strings

}