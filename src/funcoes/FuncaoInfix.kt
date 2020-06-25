package funcoes

/*A ideia da Class é encapsular dados e códigos que trabalham sobre esses dados dentro de uma única entidade
* Em java propriedades são os campos da class mais os métodos getters e/ou setters, métodos acessores.
* Já em Kotin apenas os atributos já são propriedades, pois já geram campo e métodos acessores.
* Propriedade em Kotlin já é padrão da class.
* */
class Produto(val nome: String, val preco: Double)  //não é chaves e não preciso dos gets e setters do java
                                                    // Esses são os atibutos. Não esquecer da vírgula! Em java são campos.
                                                    // Toda essa declaração são propriedades.

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco  //Corpo de Expressão

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.00)
    val p2 = Produto(preco = 3.49, nome = "Borracha") //Argumento nomeado
    println(p1 maisCaroQue p2)  //Uso da anotação infix que é a notação que está entre os dois operadores
    println(p2.maisCaroQue(p1))  //Obs que também pode chamar a função infix assim. Deixa de ser do modo infix
                                 //mas funciona
    // ++i - o ++ tá prefix
    // 1+2 - o + tá infix
    // i++ - o + tá pós fiz
}