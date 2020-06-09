package fundamentos.controles

fun main(args: Array<String>) {
    val num1: Int = 7
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {        //if é uma expressão, ele retorna um valor que pode ser posto em
        println("processando if...")          //uma var ou val. Obs que há um retorno apenas da última linha do bloco
        num1
    } else {
        println("processando else...")       //Obs que retorna apenas a última linha do bloco, mas posso colocar
        num2                                //ainda mais coisas
    }

    println("O maior valor é $maiorValor.")
}