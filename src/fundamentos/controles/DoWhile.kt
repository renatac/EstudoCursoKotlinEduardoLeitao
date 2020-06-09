package fundamentos.controles

//do while - Uso quando não tenho uma qtd determinada de repetições, mas tendo a certeza que esse laço
//será chamado pelo menos uma vez, essa é a diferênça entre ele e o while.


fun main(args: Array<String>) {
    var opcao: Int = -1

    do {
        val line = readLine() ?: "0"// ?: Elvis Operator, coloco o valor default para qd for null, "0"
        opcao = line.toIntOrNull() ?: 0    //Transformo o valor pra Int, se for null, usando o Elvis Operator, 0
        // toIntOrNull -> tenta tranformar pra Int, se não der retorna null, então o Elvis Operator coloca 0
        //Obs: testar com letra
        println("Você escolheu a opção $opcao")
    } while(opcao != -1)

    println("Até a próxima!")
}