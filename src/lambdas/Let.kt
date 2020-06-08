package lambdas

//o apply vai usando através do resultado das aplicações, encadeamento, já o let o resultado é um Unit,
//logo não encadeio. Apply é mais flexível por ter encadeamento e tb ter acesso ao objeto corrente
//que estou trabalhando dentro dele

fun main(args: Array<String>) {
    //lista de elementos
    // ? que dizer opcional - nesse caso String opcional
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    //Só mostre os elementos não nulos
    for (item in listWithNulls) {
        item?.let { println(it) }   //?. null safe call Operator
                                    // let é só pra executar apartir da referência do
    }                               // do it
}