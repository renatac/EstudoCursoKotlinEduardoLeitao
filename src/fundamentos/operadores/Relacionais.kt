package fundamentos.operadores
import java.util.*

//Em JavaScript, como ela é fracamente tipada, não tem os tipos fortes, posso querer comparar
//1 == "1" ---> true  --conteúdo
//1 === "1" ---> false -- igualdade estrita -  conteúdo e tipo em javascrip, pois ela é fracamente tipada

//No java == é a igualdade referencial e não exite o  ===

//No kotlin - Tenho o == como a Igualdade Estrutural, é o iguals do objeto - compara o conteúdo, esturutura, dados e
// o === como a Igualdade Referencial, que compara se tem a mesma refência de memória, ou seja, se elas apontam pra o mesmo endereo de memória.



//No java não existe ===, s

fun main(args: Array<String>) {

    println(3 !== 2)
    println(2!=3)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)
    println("")

    val umRef1 = 1
    val umRef2 = 1


    println("Igualdade Estrutural $umRef1 == $umRef2 --- ${umRef1 == umRef2}")
    println("Igualdade Referencial $umRef1 === $umRef2 --- ${umRef1 === umRef2}")

    val d1 = Date(0)  //Assume o ponto de início da data do java 01/01/1970
    val d2 = Date(0)  // valor Double em milisegundos passado como argumento


    // Igualdade estrutural
    println("Igualdade estrutural: Resultado com objeto d1 == d2 ${d1 == d2} \nque é a mesma coisa que d1.equals(d2) ${d1.equals(d2)}")
    // Igualdade referencial
    println("Igualdade referencial: Resultado com objeto d1 === d2 ${d1 === d2}")
}