package fundamentos

fun main(args: Array<String>) {

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