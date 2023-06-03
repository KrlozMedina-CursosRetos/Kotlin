fun main(args: Array<String>) {
    val listaNombres = listOf<String>("Carlos", "Ana", "Lina", "Juan")
    println(listaNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Alidio")
    println(listaVacia)

    val nombreGet = listaVacia.get(0)
    println(nombreGet)

    val nombreUsandoOperador = listaVacia[0]
    println(nombreUsandoOperador)

    val primerValor = listaNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Juan")
    listaVacia.removeIf{item -> item.length > 3}
    println(listaVacia)


    val myArray = arrayOf(1,2,3,4)
    println("Mi array ${myArray.toList()}")

    val listaNumerosLoteria = listOf<Int>(10, 45, 23, 94, 35, 1, 26, 50)
    println(listaNumerosLoteria)
    val numerosOrdenados = listaNumerosLoteria.sorted()
    println(numerosOrdenados)
    val numerosOrdenadosDesendiente = listaNumerosLoteria.sortedDescending()
    println(numerosOrdenadosDesendiente)
    val numerosOrdenarMultiplos = listaNumerosLoteria.sortedBy { numero -> numero < 50 }
    println(numerosOrdenarMultiplos)
    val numerosOrdenarAleatorio = listaNumerosLoteria.shuffled()
    println(numerosOrdenarAleatorio)
    val numerosReversa = listaNumerosLoteria.reversed()
    println(numerosReversa)
    println(listaNumerosLoteria.map { numero -> "El nnumero es $numero" })
    println(listaNumerosLoteria.filter { numero -> numero > 40 })

    val edadSuperheroes = mapOf<String, Int>(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperheroes)

    val edadSuperHeroesMutable = mutableMapOf<String, Int>()
    edadSuperHeroesMutable.put("Ironman", 35)
    edadSuperHeroesMutable["Spiderman"] = 23
    println(edadSuperHeroesMutable)
    println(edadSuperheroes.get("Ironman"))
    edadSuperHeroesMutable.remove("Spiderman")
    println(edadSuperHeroesMutable)
    println(edadSuperHeroesMutable.keys)

    val vocales = setOf<String>("a", "e", "i", "o", "o", "u", "a")
    println(vocales)
    val numeros = mutableSetOf<Int>(1,2, 3, 4, 5,6,3, 2,3)
    println(numeros)
    numeros.add(1)
    numeros.add(16)
    println(numeros)
    numeros.remove(1)
    println(numeros)
    println(numeros.firstOrNull{numero -> numero > 3})
}