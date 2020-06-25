package fundamentos

//Erro de run time que é o erro de execução
//Forçando Exceção Null Pointer
//!! - conheço o risco de ter null pointer, mas assumo o risco. Forço o compilador a aceitar o talvez seja nulo.

fun main(args: Array<String>) {
    var a: Int? = null  // Uso o ? Safe Call Operator pra poder atribuir o null na var opcional
    println(a?.inc())  // ? Safe Call Operator

    println("Momento do erro...")
    println(a!!.inc())   // Vou chamar fun de a mesmo que ela esteja nula, pode chamar
}