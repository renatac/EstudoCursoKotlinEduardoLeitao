package fundamentos

// Operador de Chamada segura - Safe Call Operator - variável opcional
// Kotlin - Seguro em relação a ponteiros nulos
// Em kotlin tudo é Objeto - acessar um método ou atributo de um objeto que esteja nulo, gera-se um
// null pointer exception. Pra que objetos nulos não sejam acessados uso ?

/*Operador de Chamada segura - Safe Call Operator - variável opcional: ? -- que diz que é opcional, preciso usar qd o valor pode ser nulo, ou seja
pode não ter valor: Int? = null ou posso chamar funções dessa variável nula usando também o ? assim: println(a?.dec()), então não terei problema.
o resultado é nulo. Em java não temos isso. */

fun main(args: Array<String>) {
    var a: Int? = null // safe call operator
    println(a?.dec())  // safe call operator
}