package fundamentos

//as - Operador Cast - conversão explícita

fun imprimirConceito(nota: Any) {   // transformando um tipo mais genérico Any para um mais específico Int
    when(nota as? Int ) {          //Esse opcional deixa eu fazer a chamada dessa função com tipo Double por ex
        10, 9 -> println("A")            //Aqui já tô com tipo Int, Smart Cast
        8, 7 -> println("B")             //as? nesse caso é a conversão segura no qual ele pode nao ser Int, ser null
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        //r -> println("F")             // dá erro, pois não é Int
        else -> println("Nota inválida")
    }
}

fun main(args: Array<String>) {
    val notas = arrayOf(9.6 , 3.8, 7.2, 5.5, 4.1)   //arrayOf de Double
    for(nota in notas) {
        imprimirConceito(nota.toInt())
    }

    imprimirConceito("ana") // isso só pega por conta do as? Int ---> Int opcional lá na fun
}