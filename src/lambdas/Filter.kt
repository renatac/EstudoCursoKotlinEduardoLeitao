package lambdas

// fun filter - pega uma lista e filtra de acordo com uma condição retornando outra lista.
// Tem objetivo de filtrar, reduzir a lista de acordo com o critério passado dentro, os itens que
//não estão dentro desse critério são excluídos da lista final

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
            Aluno("Pedro", 7.4),
            Aluno("Artur", 8.0),
            Aluno("Rafael", 9.7),
            Aluno("Ricardo", 5.7)
    )

    //filter retorna uma lista de acordo com as condições
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome } //ordenação crescente
                                                  //.sorteBy{-it.nome} ordenação decrescente
    println(aprovados)
}