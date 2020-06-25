package fundamentos

//Templates Strings

fun main(args: Array<String>) {
    val bomHumor = false
    print("Hoje estou ${if (bomHumor) "feliz" else "chateado"}.") //Não precisei pôr nada, nem um scape para poder
    //colocar "" dentro de outra "", pois dentro é uma expressão
}