package fundamentos
//Kotlin
//caractere : 'a' ---> aspas simples
//Strings : "aluno"  ---> aspas duplas

//Templates Strings: variáveis dentro da String para que elas possam ser interpoladas, ou seja, interpretadas
//dentro do texto. Ele evita a concatenação através da soma +
// Sintaxe do Template String   "ana $nomeDaVarOuCte" ou "ana ${nomeDaVarOuCte}"

fun main(args: Array<String>) {
    val aprovados = listOf("João", "Maria", "Pedro")
    print("O primeiro colocado foi ${aprovados[0]}.")
    //print("O primeiro colocado foi + aprovados[0]} +".")  essa é a forma antiga

    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")

    val (a,b,c,d, e) = nomes     // Destructuring
    println("a = $a \nb = $b \nc = $c \nd = $d \ne = $e")   //Templates Strings

    println("\n\ta = ${nomes[0]} \n" +
            "\tb = ${nomes[1]} \n" +          //Obs que esse + ele pôs sozinho quando dei enter
            "\tc = ${nomes[2]} \n" +
            "\td = ${nomes[3]} \n" +
            "\te = ${nomes[4]}")

//Obs que essa linha de cima eh a mesma que essa sem eu dar enter
    println("\n\ta = ${nomes[0]} \n\tb = ${nomes[1]} \n\tc = ${nomes[2]} \n\td = ${nomes[3]} \n\te = ${nomes[4]}")

}