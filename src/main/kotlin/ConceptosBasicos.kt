fun main(args: Array<String>) {
    var contador = 10
    while (contador > 0) {
        println("El contador es $contador")
        contador--
    }

    do {
        val numeroAleatorio = (0..100).random()
        println("El numero random es $numeroAleatorio")
    } while (numeroAleatorio > 50)


    val listaFrutas = listOf("Banana", "Manzana", "Pera", "Fresa", "Cereza", "Durazno")
    for (fruta in listaFrutas) println("for in $fruta")
    listaFrutas.forEach{fruta -> println("foreach $fruta")}

    val caracteresFrutas : List<Int> = listaFrutas.map { fruta -> fruta.length }
    println(caracteresFrutas)

    val listaFilter = caracteresFrutas.filter { characterFruta -> characterFruta > 5 }
    println(listaFilter)

    var nombre : String? = null
//    nombre!!.length
//    println(nombre?.length)
    try {
        nombre!!.length
    } catch (e : Exception){
        println(e)
    } finally {
        println("Bloqueado")
    }

    val primerValor = 10
    val segundaValor = 0
    val resultado = try { primerValor / segundaValor } catch (e : Exception) { println(e)}

//    Elvis Operator
    var name : String? = null
    val caracteresName : Int = name?.length ?: 0
    println(caracteresName)
}