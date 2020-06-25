package fundamentos

//Notação Ponto .  - formas que tenho para acessar membros de um objeto, de uma instância ou de uma class
//Em Kotlin tudo é objeto

fun main(args: Array<String>) {
    val a: Int = 33.dec()
    var b: String = a.toString()
    val c = 33.inc()

    println("Int: $a")
    println("Primeiro char da string b é: ${b.first()}")
    println("Int: $c")

}