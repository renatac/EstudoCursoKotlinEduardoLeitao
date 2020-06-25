package fundamentos

//Elvis Operator :  ?: valorDefaul --- atribui um valor padrão quando não sei se é null, se for null,
//esse valor é atribuído como default

fun main(args: Array<String>) {
    //? é o Safe Call Operator pra dizer que a constante é opcional, preciso quando vou atribuir null, ou ela
    //pode ser null
    val opcional: String? = null
    //val precisa ter um valor, mas a String passada pra ele é opicional, logo o
    //Operador Elvis Operator ?: vai atribuir um valor se o resultado for null, um valor default
    val obrigatorio: String = opcional ?: "Valor Padrão"

    println(obrigatorio)
}