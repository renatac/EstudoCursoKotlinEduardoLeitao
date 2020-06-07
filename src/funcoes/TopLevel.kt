package funcoes

//Funções top levels é uma função que está fora de uma class,
//isso em java não é possível, pois é tudo dentro de class
//Obs que essas funções são do tipo estáticas
fun min(a: Int, b: Int): Int = if(a < b) a else b //Corpo de Expressão

fun main(args: Array<String>) {
    print("O menor valor é ${min(3, 4)}")
}