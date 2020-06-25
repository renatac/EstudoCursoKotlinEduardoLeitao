package fundamentos

//No kotlin is , no java instanceOf;
//is - checagem de tipos

fun main(args: Array<String>) {
    val valor = "abc"

    if (valor is String) {
        println(valor)
    } else if (valor !is String) {
        println("Não é uma String")
    }
}