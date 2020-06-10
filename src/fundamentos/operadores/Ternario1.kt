package fundamentos.operadores

//Ternário : não existe o ? como ternário em kotlin, mas tá relacionado a ter 3 elementos
//Segue um efeito de um ternário em kotlin usando if else
//No kotlin uma estrutura de controle como o if else retorna um valor, eles são uma expressão

fun main(args: Array<String>) {
    val nota: Double = 7.2
    //Em java seria
    //val resultado: String = (nota >= 7) ? "Aprovado" : "Reprovado". Isso em kotlin dá erro
    val resultado: String = if(nota >= 7) "Aprovado" else "Reprovado"
    println(resultado)
}