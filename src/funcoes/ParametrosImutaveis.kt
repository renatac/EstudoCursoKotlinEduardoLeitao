package funcoes

//Parâmetros são imutáveis

//Aqui tem-se um exemplo de função que retorna Unit por inferência de tipo, que é void no java.
//Se eu pôr Unit no retorno explícito da fun, o Lint deixa cinza, pois não é necessário
fun incremento(num: Int) {
     //num++ // num = num + 1       // dá erro, pois toodo parâmetro de fun é por defaul do tipo val, ou seja,
}                                   // não pode ter reatribuição de valores

fun main(args: Array<String>) {
    incremento(3)
}