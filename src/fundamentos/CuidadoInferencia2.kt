package fundamentos

//Kotlin é fortemente tipada:  estaticamente tipada (variáveis com tipos específicos), pois a tipificação
//é feita já em tempo de compilação

fun main(args: Array<String>) {
    var a: Double = 1.0
    var b = 2
    //a = 3   essa linha dá erro, pois Kotlin é fortemente tipada, uma vez uma val ou var tipada, o tipo não pode ser
    a = 2.3                          //mudado.

    print(a + b)
}