package fundamentos.controles

//while - igual no java
//Uso quando não tenho uma qtd determinada de repetições uso while, se eu tiver uso for

fun main(args: Array<String>) {
    var opcao: Int = 0

    while(opcao != -1) {
        val line = readLine() ?: "0"            // ?: Elvis Operator, coloco o valor default para qd for null, "0"
        opcao = line.toIntOrNull() ?: 0    //Transformo o valor pra Int, se for null, usando o Elvis Operator, 0
        // toIntOrNull -> tenta tranformar pra Int, se não der retorna null, então o Elvis Operator coloca 0
        //Obs: testar com letra

        println("Você escolheu a opção $opcao")
    }

    println("Até a próxima!")


}