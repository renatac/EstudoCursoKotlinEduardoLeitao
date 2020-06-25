package fundamentos
//Inferência de tipos - dps disso o kotlin amarra aquela variável para aquele tipo, pois
//é uma linguagem fortemente tipada

fun main(args: Array<String>) {
    //Descomente essas duas linhas
//    var a
//    a = 3
    // Dá erro por causa da var a
    //Error: This variable must either have a type annotation or be initialized
    // O ajuste seria lá em cima pôr var a : Int

    var b = 2  // Inferência de tipo Int


}