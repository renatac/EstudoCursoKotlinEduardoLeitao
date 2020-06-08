package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")
    val ordenados1 = nomes.sortedBy { it }
    val ordenados2 = nomes.sortedBy ({ it })   //Assim tb funciona
    //Aqui os nomes continuam os mesmos, mas tô fazendo a ordenação contando da letra do final pra a do começo,
    //ou seja, ordem decrescente
    val ordenadosInvertidos = nomes.sortedBy { it.reversed() }

    println(ordenados1)
    println(ordenados2)
    println(ordenadosInvertidos)

}