package collections

// map - é como se fosse um set com um list - chave e valor
// set - sem repetição - para a chave única
// list - com repetição - valor
// Posso percorrer um map através da chave ou dos valores
// Diferente do set e do list, não tem o método add que é put
// map --> put  é pra inserir e tb para alterar
// set e list --> add - só adiciona e não altera

fun main(args: Array<String>) {
    var map = HashMap<Long, String?>() // aqui pus ? que é o opcional, porque pode ser String ou não
    map.put(10020033040,"João")
    map.put(20020033040,null)
    map.put(30020033040,"Pedro")
    map.put(30020033040,"Ana")

    for(par in map){
        println(par)
    }

    for(par in map.entries){
        println(par)
    }

    for(cpf in map.keys){
        println(cpf)
    }

    for(nome in map.values){
        println(nome)
    }

    for((cpf, nome) in map){                      // Destructuring
        println("CPF : $cpf - Nome : $nome")  // Template String
    }

    println(map.size)
    println(map.get(20020033040)?.length)  //null safe call - como pode dar null preciso dele
    println(map[30020033040]?.length) // null safe call - como pode dar null preciso dele

    println(map.contains(10020033040))      //true
    println(map.containsKey(10020033040))   //true
    println(map.containsValue("Ana"))          //true
    println(map.remove(10020033040))  // null safe call - como pode dar null preciso dele
    map.clear()
    println(map.isEmpty())

}