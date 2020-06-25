package fundamentos

//Conversão número -> String

fun main(args: Array<String>) {
    val a = 1   // Aqui há uma inferência de tipos

    // Número para String
    println(a.toString() + 1) // concatenação, pois a const "a" para string "1"

    // String para Número
    println("1.9".toDouble() + 3) //. divide as casas decimais - padrão americano
    println("Teste".toIntOrNull())  // Tento, se não der retorno null
    println("Teste".toIntOrNull() ?: 0)  // é bom pra usar o Elvis Operator
    println("1".toInt() + 3)  //4

}