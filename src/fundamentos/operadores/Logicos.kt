package fundamentos.operadores

//Operadores Lógicos

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = false

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    // Operador Unário
    if(!comprouSorvete) {
        println("A saúde agradece.")
    }

    val testeXorV = true xor true
    val testeXorF = false xor false
    val testeXorDiferentes = true xor false

    println("Testando xor\ntesteXorV = $testeXorV, testeXorF = $testeXorF e testeXorDiferentes = $testeXorDiferentes")
    println("xor é iguais --> true  e diferentes --> false")

}
