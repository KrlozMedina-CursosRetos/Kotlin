fun main(args: Array<String>) {
    imprimirFrase("hola".randomCase())
    imprimirNombre("Carlos", "Alidio", "Medina")

    val myLambda : (String) -> Int = {
        it.length
    }
    println(myLambda("Hola mundo"))

    val listaSaludos = listOf<String>("Hola", "Hello", "Ciao")
    println(listaSaludos.map(myLambda))

    val largoValorInicial = superFuncion(valorInicial = "Hola", block = {valor -> valor.length})
    println(largoValorInicial)

    val lambda = funcionInseption("Carlos")
    println(lambda())
}

fun String.randomCase() : String {
    val numeroAleatorio = (0..99).random()
    return if(numeroAleatorio.rem(2) == 0) {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}

fun imprimirFrase(frase : String) : Unit {
    println("Tu frase es $frase")
}

fun imprimirNombre(nombre : String, apellido : String) : Unit {
    println("Mi nombre es $nombre $apellido")
}

fun imprimirNombre(Nombre : String, SegundoNombre : String, Apellido : String) : Unit {
    println("Mi nombre es $Nombre $SegundoNombre $Apellido")
}

fun superFuncion(valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun funcionInseption(nombre: String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}