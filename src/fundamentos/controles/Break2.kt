package fundamentos.controles

fun main(args: Array<String>) {
    //Break rotulado - tente não usar por favor! Aqui eu só tô entendendo.
    //Lembra mt o antigo go to, antigo, do código macarrônico. Não use, só entenda o que é
    externo@for (i in 1..15) {              //Dou um rótulo externo@ para ele
        for (j in 1..15) {
            if (i == 2 && j == 9) break@externo  // Com esse rótulo ele sai tb do laço externo quando sair desse.
            println("$i $j")                     // Normalmente sairia só desse laço externo, sem o @externo
        }                                        //Obs que poderia ser outro nome, o break sai do laço que está com o
    }                                            //rótulo
    println("Fim!")

    println("");

    //Pode ser qlq nome nesse rótulo:
    qlqCoisa@for (i in 1..15) {              //Dou um rótulo qlqCoisa@ para ele
        for (j in 1..15) {
            if (i == 2 && j == 9) break@qlqCoisa  // Com esse rótulo ele sai tb do laço externo quando sair desse.
            println("$i $j")                     // Normalmente sairia só desse laço externo, sem o @qlqCoisa
        }                                        //Obs que poderia ser outro nome, o break sai do laço que está com o
    }                                            //rótulo
    println("Fim!")
}