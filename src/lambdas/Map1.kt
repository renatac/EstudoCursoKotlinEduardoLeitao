package lambdas

// fun map - é responsável por transformar um conjunto de dados de um Array, uma lista, para
// outro conjunto de dados de mesmo tamanho sempre!
// Percorre cada elemento e a partir da função lambda que passo pra ele , converto o item pra alguma coisa
//que quero que seja o Array resultante


fun main(args: Array<String>) {

    //arrayListOf() é uma colection variável, poderia ser de tipos variáveis tb
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { print(this) }  //a fun apply pega o array completo já
                                                           // todas em maiúsculas

}