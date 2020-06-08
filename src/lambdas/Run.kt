package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()

    //parece com o apply, mas diferente do apply, o run não retorna o próprio objeto e é menos flexível.
    //Ou seja no final eu não poderia colocar . e ter mais opções, pois teria um objeto casa
    casa.run {
        endereco = "Rua ABC"
        num = 1544
    }
//
//    casa.apply {
//        endereco = "Rua ABC"
//        num = 1544
//    }.endereco                        exemplo do que citei acima!

    println(casa)
}