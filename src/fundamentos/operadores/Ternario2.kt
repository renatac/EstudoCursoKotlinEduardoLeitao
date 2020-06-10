package fundamentos.operadores
//Ternário : não existe o ? como ternário em kotlin, mas tá relacionado a ter 3 elementos
//Segue um efeito de um ternário em kotlin usando if else
//No kotlin uma estrutura de controle como o if else retorna um valor, eles são uma expressão

fun obterResultado(nota : Double) : String = if(nota >= 7.0) "Passou" else "Reprovou"

fun main(args: Array<String>) {
    print(obterResultado(8.3))
}