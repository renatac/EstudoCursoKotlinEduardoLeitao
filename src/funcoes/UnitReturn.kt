package funcoes

fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun imprimeMaior4(a: Int, b: Int): Unit {   // O tipo de retorn da fun é Unit, que o mesmo que o void em java
    println(Math.max(a, b))                 //Perceba que nem precisava tá escrito
    return Unit
}

fun imprimeMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimeMaior1(2, 1)
    imprimeMaior2(2, 1)
    imprimeMaior3(2, 1)
    imprimeMaior4(2, 1)
    //Como o Unit é um objeto, ele tem algumas funcionalidades dentro dele, logo
    //Então posso chamar a função lambda run
                              //Boolen                //this sobre o Boolean
    imprimeMaior5(2, 1).run { 2 > 4 }.run { print("Resultado = $this") }
    //Ou seja, Unit é um objeto e pode ter algumas funcionalidades, como por ex fazer o encadeamento
    //de várias chamadas
}