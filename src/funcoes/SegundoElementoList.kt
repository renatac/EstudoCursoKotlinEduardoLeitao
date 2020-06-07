package funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    val list1 = listOf("João", "Maria", "Pedro")
    val list2 = listOf(null)
    val list3 = listOf("Ju")
    println(list1.secondOrNull())
    println(list2.secondOrNull())
    println(list3.secondOrNull())
}