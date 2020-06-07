package funcoes

//Argumentos variáveis: a capacidade de passar uma quantidade de parêmetros variáveis para um método
//Era o ... no java, aqui no kotlin é vararg
fun ordenar(vararg numeros: Int, a: Int): IntArray {
    println("O argumento nomeável é o \"a\" = $a")
    return numeros.sortedArray()          // retorna um Array de Int ordenado
}

fun main(args: Array<String>) {
    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73, a = 1)) {  // o argumento nomeado a deve realmente ser
        print("$n ")                                                    //nomeado
    }
}