fun main(args: Array<String>) {
    var nombre : String? = null
    letFunction(nombre)
    nombre = "Krloz"
    letFunction(nombre)

    val listaColores = listOf<String>("Azul", "Rojo", "Verde")
    with(listaColores) {
        println("Nuestros colores osn $this")
        println("El tamano de la lista es $size")
    }

    val listaMoviles = mutableListOf<String>("Google Pixel 2XL", "Google Pixel 4A", "Huawei Redmi 9", "Xiaomi A3")
        .run {
            removeIf{movil -> movil.contains("Google")}
            this
        }
    println(listaMoviles)

    val moviles = mutableListOf<String>("Google Pixel 2XL", "Google Pixel 4A", "Huawei Redmi 9", "Xiaomi A3")
        .apply { removeIf { movil -> movil.contains("Google") } }
    println(moviles)

    val colores : MutableList<String>? = null
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }
}

fun letFunction(dato : String?) : Unit {
    dato?.let { valor -> println("El nombre no es nulo, el nombre es $dato") }
}